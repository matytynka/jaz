package pl.edu.pjwstk.jaz.auction;

import pl.edu.pjwstk.jaz.auth.ProfileEntity;
import pl.edu.pjwstk.jaz.users.UserSession;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class AuctionPage {

    @Inject
    private AuctionRepository auctionRepository;

    @Inject
    private UserSession userSession;

    private Auction auction;
    private Integer id;

    public void setId(Integer id){
        auction = auctionRepository.getbyId(id);
        this.id = id;
    }

    public Integer getId() { return id; }
    public String getTitle() { return auction.getTitle(); }
    public String getDescription() { return auction.getDescription(); }
    public String getPrice() { return auction.getPrice(); }
    public String getOwner() { return auction.getOwner().getUsername(); }

}
