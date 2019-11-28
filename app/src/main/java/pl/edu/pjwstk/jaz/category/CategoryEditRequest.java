package pl.edu.pjwstk.jaz.category;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class CategoryEditRequest {
    private String oldName;
    private String newName;
    private String newSectionName;

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

    public String getNewSectionName() {
        return newSectionName;
    }

    public void setNewSectionName(String newSectionName) {
        this.newSectionName = newSectionName;
    }

    @Override
    public String toString() {
        return "SectionRequest{" +
                "oldName='" + oldName + '\'' +
                "newName='" + newName +
                "newSectionName='" + newSectionName + '}';

    }
}
