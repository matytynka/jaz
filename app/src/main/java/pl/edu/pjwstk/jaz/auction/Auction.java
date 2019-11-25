package pl.edu.pjwstk.jaz.auction;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Auction {

    @Id
    private int id;
    /*@OneToMany
    private List<Photo> photos;*/
}
