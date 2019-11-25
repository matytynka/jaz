package pl.edu.pjwstk.jaz.auth;

import pl.edu.pjwstk.jaz.auction.Section;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@ApplicationScoped
public class SectionRepository {
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void newSection(Section section) {
        em.persist(section);
    }

    @Transactional
    public void updateSection(Section section) {
        em.merge(section);
    }
}
