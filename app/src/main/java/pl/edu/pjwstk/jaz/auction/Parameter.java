package pl.edu.pjwstk.jaz.auction;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


    @Entity
    @Table(name = "parameter")
    public class Parameter {
        @Id
        private int id;

        @Column(name = "name")
        private String name;
}
