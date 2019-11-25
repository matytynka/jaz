package pl.edu.pjwstk.jaz.webapp;

import pl.edu.pjwstk.jaz.auction.Section;
import pl.edu.pjwstk.jaz.auth.SectionRepository;
import pl.edu.pjwstk.jaz.login.SectionRequest;

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

    public void addSection() {
        sectionRepository.newSection(new Section(sectionRequest.getName()));
    }
}
