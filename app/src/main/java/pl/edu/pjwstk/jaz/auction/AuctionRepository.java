package pl.edu.pjwstk.jaz.auction;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Named
@ApplicationScoped
public class AuctionRepository {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void newAuction(Auction auction) {
        em.persist(auction);
    }

    @Transactional
    public void updateAuction(Auction auction) {
        em.merge(auction);
    }

    @Transactional
    public List<Auction> getAuctionList() {
        return em.createQuery("from Auction", Auction.class).getResultList();
    }
}

