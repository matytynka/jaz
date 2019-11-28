package pl.edu.pjwstk.jaz.category;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

    @Named
    @RequestScoped
    public class CategoryRequest {
        private String name;
        private String sectionName;

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getSectionName() {
            return sectionName;
        }

        public void setSectionName(String sectionName) {
            this.sectionName = sectionName;
        }

        @Override
        public String toString() {
            return "CategoryRequest{" +
                    "name='" + name + '\'' +
                    "sectionName='" + sectionName + '}';
        }
}

