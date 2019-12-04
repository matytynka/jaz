package pl.edu.pjwstk.jaz.auction;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class AuctionController {

    @Inject
    private AuctionRequest auctionRequest;

    @Inject
    private AuctionRepository auctionRepository;

    //String title, String description, float price, Category category, ProfileEntity owner, List<Photo> photos

    public void addAuction() {
        auctionRepository.newAuction(new Auction(auctionRequest.getTitle(),auctionRequest.getDescription(),
                auctionRequest.getPrice(),auctionRequest.getCategory(),auctionRequest.getOwner(),auctionRequest.getPhotos()));

    }
}
