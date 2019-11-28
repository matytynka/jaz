package pl.edu.pjwstk.jaz.section;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class SectionController {
    @Inject
    private SectionRequest sectionRequest;

    @Inject
    private SectionRepository sectionRepository;

    @Inject
    private SectionEditRequest sectionEditRequest;

    public void addSection() {
        sectionRepository.newSection(new Section(sectionRequest.getName()));
    }

    public void updateSection() {
        Section section = sectionRepository.findByName(sectionEditRequest.getOldName()); //stara nazwa
        section.setName(sectionEditRequest.getNewName()); // nowa nazwa
        sectionRepository.updateSection(section);
    }
}
