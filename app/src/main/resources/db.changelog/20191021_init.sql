CREATE SEQUENCE hibernate_sequence;

CREATE TABLE profile
(
    username VARCHAR NOT NULL,
    name VARCHAR   NOT NULL,
    surname VARCHAR NOT NULL,
    email VARCHAR NOT NULL,
    birthdate VARCHAR NOT NULL,
    password VARCHAR NOT NULL,

    PRIMARY KEY (username)
);