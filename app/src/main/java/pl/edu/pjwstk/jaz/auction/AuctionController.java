package pl.edu.pjwstk.jaz.auction;

import pl.edu.pjwstk.jaz.users.UserSession;

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

    @Inject
    private UserSession userSession;

    @Inject
    private AuctionEditRequest auctionEditRequest;

    //String title, String description, float price, Category category, ProfileEntity owner, List<Photo> photos

    public void addAuction() {
        auctionRepository.newAuction(new Auction(auctionRequest.getTitle(),auctionRequest.getDescription(),
                auctionRequest.getPrice(),auctionRepository.findByName(auctionRequest.getCategory()),userSession.getProfile()));

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
}
