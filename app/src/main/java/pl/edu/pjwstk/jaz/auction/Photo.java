package pl.edu.pjwstk.jaz.auction;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "photo")
public class Photo {
    @Id
    private Long id;

    @Column(name = "link")
    private String link;
}
