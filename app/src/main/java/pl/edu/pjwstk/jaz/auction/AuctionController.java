package pl.edu.pjwstk.jaz.auction;

import pl.edu.pjwstk.jaz.users.UserSession;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Named
@RequestScoped
public class AuctionController {

    @Inject
    private AuctionRequest auctionRequest;

    @Inject
    private AuctionRepository auctionRepository;

    @Inject
    private UserSession userSession;

    @Inject
    private AuctionEditRequest auctionEditRequest;

    @Inject
    private PhotoRepository photoRepository;

    //String title, String description, float price, Category category, ProfileEntity owner, List<Photo> photos

    public static final String LOCATION = "C:\\tmp\\";

    public void addAuction() {
        long auctionID = auctionRepository.newAuction(new Auction(auctionRequest.getTitle(),auctionRequest.getDescription(),
                auctionRequest.getPrice(),auctionRepository.findByName(auctionRequest.getCategory()),userSession.getProfile()));

        String upload = uploadPhoto(auctionRequest.getPhoto1());
        photoRepository.addPhoto(new Photo(upload, auctionRepository.getbyId(auctionID)));

        String upload2 = uploadPhoto(auctionRequest.getPhoto2());
        photoRepository.addPhoto(new Photo(upload2, auctionRepository.getbyId(auctionID)));

        String upload3 = uploadPhoto(auctionRequest.getPhoto3());
        photoRepository.addPhoto(new Photo(upload3, auctionRepository.getbyId(auctionID)));

    }

    public void updateAuction() {
        Auction auction = auctionRepository.getbyId(auctionEditRequest.getId());
        if (!auctionEditRequest.getTitle().isEmpty()) {
            auction.setTitle(auctionEditRequest.getTitle());
        }
        if (!auctionEditRequest.getDescription().isEmpty()) {
            auction.setDescription(auctionEditRequest.getDescription());
        }
        if (auctionEditRequest.getPrice()!=0.0) {
            auction.setPrice(auctionEditRequest.getPrice());
        }
        auction.setCategory(auctionRepository.findByName(auctionEditRequest.getCategory()));
        auctionRepository.updateAuction(auction);
    }

    public String uploadPhoto(Part photo) {
        String photoFile = Paths.get(photo.getSubmittedFileName()).getFileName().toString();
        try (InputStream input = photo.getInputStream()) {
            Files.copy(input, new File(LOCATION, photoFile).toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.out.println(e);
        }
        return photoFile;
    }
}
