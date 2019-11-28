package pl.edu.pjwstk.jaz.section;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class SectionEditRequest {
    private String oldName;
    private String newName;

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    @Override
    public String toString() {
        return "SectionRequest{" +
                "oldName='" + oldName + '\'' +
                "newName='" + newName + '}';
    }
}
