package pl.edu.pjwstk.jaz.auth;

import pl.edu.pjwstk.jaz.auction.Category;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@ApplicationScoped
public class CategoryRepository {
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void newCategory(Category category) {
        em.persist(category);
    }

    @Transactional
    public void updateCategory(Category category) {
        em.merge(category);
    }
}
