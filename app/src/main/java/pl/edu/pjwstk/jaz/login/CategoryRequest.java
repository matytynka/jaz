package pl.edu.pjwstk.jaz.login;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

    @Named
    @RequestScoped
    public class CategoryRequest {
        private String name;

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }


        @Override
        public String toString() {
            return "CategoryRequest{" +
                    "name='" + name + '\'' + '}';
        }
}

