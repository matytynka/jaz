package pl.edu.pjwstk.jaz.auction;

import pl.edu.pjwstk.jaz.auth.ProfileEntity;
import pl.edu.pjwstk.jaz.category.Category;

import javax.persistence.*;
import java.util.List;

@Entity
public class Auction {

    @Id
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private float price;

    @ManyToOne
    @JoinColumn(name = "category")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "owner")
    private ProfileEntity owner;

    @OneToMany
    private List<Photo> photos;

    public Auction(String title, String description, float price, Category category, ProfileEntity owner, List<Photo> photos) {
        this.title = title;
        this.price = price;
        this.category = category;
        this.owner = owner;
        this.photos = photos;
    }
    public Auction() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public ProfileEntity getOwner() {
        return owner;
    }

    public void setOwner(ProfileEntity owner) {
        this.owner = owner;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }
}
