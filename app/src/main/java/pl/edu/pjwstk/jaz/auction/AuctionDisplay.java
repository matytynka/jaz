package pl.edu.pjwstk.jaz.auction;

import pl.edu.pjwstk.jaz.users.UserSession;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class AuctionDisplay {

    @Inject
    UserSession userSession;

    @Inject
    AuctionRepository auctionRepository;

    public List<Auction> getMyAuctions() {
        List<Auction> piwo = auctionRepository.findByOwner(userSession.getProfile());
        return piwo;
    }

}
