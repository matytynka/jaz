package pl.edu.pjwstk.jaz.auction;

import javax.persistence.*;


@Entity
    @Table(name = "parameter")
    public class Parameter {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column(name = "name")
        private String name;
}
