package pl.edu.pjwstk.jaz.category;

import pl.edu.pjwstk.jaz.section.Section;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category { //Category w Section
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "section")
    private Section section;

    public Category(String name, Section section) {
        this.name = name;
        this.section = section;
    }
    public Category() {}

    public void setName(String name) {
        this.name = name;
    }

    public void setSection(Section section){
        this.section = section;
    }

    public String getName() {
        return name;
    }

    public Section getSection() {
        return section;
    }
}
