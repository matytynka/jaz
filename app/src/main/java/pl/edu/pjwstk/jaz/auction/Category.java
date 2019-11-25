package pl.edu.pjwstk.jaz.auction;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category { //Category w Section
    @Id
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "section")
    private Section section;

}
