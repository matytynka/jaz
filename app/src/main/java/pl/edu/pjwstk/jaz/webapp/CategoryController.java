package pl.edu.pjwstk.jaz.webapp;

import pl.edu.pjwstk.jaz.auction.Category;
import pl.edu.pjwstk.jaz.auction.Section;
import pl.edu.pjwstk.jaz.auth.CategoryRepository;
import pl.edu.pjwstk.jaz.auth.SectionRepository;
import pl.edu.pjwstk.jaz.login.CategoryRequest;
import pl.edu.pjwstk.jaz.login.SectionRequest;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class CategoryController {
    @Inject
    private CategoryRequest categoryRequest;

    @Inject
    private CategoryRepository categoryRepository;

    public void addCategory() {
        //categoryRepository.newCategory(new Category(categoryRequest.getName()));
    }
}
