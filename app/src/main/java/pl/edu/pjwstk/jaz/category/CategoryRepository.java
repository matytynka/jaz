package pl.edu.pjwstk.jaz.category;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Named
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

    @Transactional
    public Category findByName(String name) {
        return em.createQuery("from Category where name = :categoryName", Category.class).setParameter("categoryName", name).getSingleResult();
    }

    @Transactional
    public List<Category> getCategoryList() {
        return em.createQuery("from Category", Category.class).getResultList();
    }

}
