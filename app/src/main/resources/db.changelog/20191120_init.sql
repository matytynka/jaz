CREATE TABLE parameter
(
    id SERIAL NOT NULL,
    name VARCHAR,
    PRIMARY KEY (id)
);

CREATE TABLE section
(
    id SERIAL NOT NULL,
    name VARCHAR,
    PRIMARY KEY (id)
);

CREATE TABLE category
(
    id SERIAL NOT NULL,
    name VARCHAR,
    section INTEGER NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (section) REFERENCES section(id)
);

CREATE TABLE auction
(
    id SERIAL NOT NULL,
    title VARCHAR(255),
    description VARCHAR(255),
    price FLOAT,
    category INTEGER,
    owner VARCHAR,
    PRIMARY KEY(id),
    FOREIGN KEY (owner) REFERENCES profile(username),
    FOREIGN KEY (category) REFERENCES category(id)
);

CREATE TABLE auction_parameter
(
    id SERIAL NOT NULL,
    auction SERIAL NOT NULL,
    parameter INTEGER NOT NULL,
    value VARCHAR(255),
    PRIMARY KEY (auction, parameter),
    FOREIGN KEY (parameter) REFERENCES parameter(id),
    FOREIGN KEY (auction) REFERENCES auction(id)
);

CREATE TABLE photo
(
    id SERIAL NOT NULL,
    link VARCHAR,
    auction INTEGER,
    PRIMARY KEY (id),
    FOREIGN KEY (auction) REFERENCES auction(id)
);