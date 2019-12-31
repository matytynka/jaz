package pl.edu.pjwstk.jaz.auction;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@ApplicationScoped
public class PhotoRepository {
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void addPhoto(Photo photo) {
        em.persist(photo);
    }

    @Transactional
    public void updatePhoto(Photo photo) {
        em.merge(photo);
    }
}
