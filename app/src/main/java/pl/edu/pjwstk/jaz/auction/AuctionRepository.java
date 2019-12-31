package pl.edu.pjwstk.jaz.auction;

import pl.edu.pjwstk.jaz.auth.ProfileEntity;
import pl.edu.pjwstk.jaz.category.Category;

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
    public long newAuction(Auction auction) {
        em.persist(auction);
        em.flush();
        return auction.getId();
    }

    @Transactional
    public void updateAuction(Auction auction) {
        em.merge(auction);
    }

    @Transactional
    public List<Auction> getAuctionList() {
        return em.createQuery("from Auction", Auction.class).getResultList();
    }

    @Transactional
    public List<Category> getCategoryList() {
        return em.createQuery("from Category", Category.class).getResultList();
    }

    @Transactional
    public Category findByName(String name) {
        return em.createQuery("from Category where name = :categoryName", Category.class).setParameter("categoryName", name).getSingleResult();
    }

    @Transactional
    public List<Auction> findByOwner(ProfileEntity owner) {
        return em.createQuery("from Auction where owner = :auctionOwner", Auction.class).setParameter("auctionOwner", owner).getResultList();
    }

    @Transactional
    public Auction getbyId(long id) {
        return em.createQuery("from Auction where id = :auctionId", Auction.class).setParameter("auctionId", id).getSingleResult();
    }
}

