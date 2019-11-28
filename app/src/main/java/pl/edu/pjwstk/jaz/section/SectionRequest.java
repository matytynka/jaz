package pl.edu.pjwstk.jaz.section;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class SectionRequest {
    private String name;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }


    @Override
    public String toString() {
        return "SectionRequest{" +
                "name='" + name + '\'' + '}';
    }

    /*public Section getSection() {
        Section sec = new Section(this.id, this.name);
        return sec;
    }*/
}
