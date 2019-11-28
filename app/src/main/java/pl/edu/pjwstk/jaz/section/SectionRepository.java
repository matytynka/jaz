package pl.edu.pjwstk.jaz.section;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Named
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

    @Transactional
    public Section findByName(String category) {
        return em.createQuery("from Section where name = :sectionName", Section.class).setParameter("sectionName", category).getSingleResult();
    }

    @Transactional
    public List<Section> getSectionList() {
        return em.createQuery("from Section", Section.class).getResultList();
    }
}
