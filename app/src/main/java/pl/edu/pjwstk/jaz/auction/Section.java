package pl.edu.pjwstk.jaz.auction;

import javax.persistence.*;

@Entity
@Table(name = "section")
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    public Section(String name) {
        this.name = name;
    }
    public Section() {}

}
