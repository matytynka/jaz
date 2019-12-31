package pl.edu.pjwstk.jaz.auction;

import pl.edu.pjwstk.jaz.auth.ProfileEntity;
import pl.edu.pjwstk.jaz.category.Category;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.servlet.http.Part;
import java.util.List;

@Named
@RequestScoped
public class AuctionRequest {

    //String title, String description, float price, Category category, ProfileEntity owner, List<Photo> photos

    private String title;
    private String description;
    private float price;
    private String category;
    private ProfileEntity owner;
    private List<Photo> photos;
    private Part photo1, photo2, photo3;

    public Part getPhoto1() {
        return photo1;
    }

    public void setPhoto1(Part photo1) {
        this.photo1 = photo1;
    }

    public Part getPhoto2() {
        return photo2;
    }

    public void setPhoto2(Part photo2) {
        this.photo2 = photo2;
    }

    public Part getPhoto3() {
        return photo3;
    }

    public void setPhoto3(Part photo3) {
        this.photo3 = photo3;
    }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
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

    @Override
    public String toString() {
        return "AuctionRequest{" +
                "title='" + title + '\'' +
                "description='" + description +
                "price='" + price + '}';
    }
}
