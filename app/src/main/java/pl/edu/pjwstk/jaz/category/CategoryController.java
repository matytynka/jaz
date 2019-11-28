package pl.edu.pjwstk.jaz.category;

import pl.edu.pjwstk.jaz.section.SectionRepository;

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

    @Inject
    private SectionRepository sectionRepository;

    @Inject
    private CategoryEditRequest categoryEditRequest;

    public void addCategory() {
        System.out.println("Tried to add" + categoryRequest.toString());
        categoryRepository.newCategory(new Category(categoryRequest.getName(), sectionRepository.findByName(categoryRequest.getSectionName())));
    }

    public void updateCategory() {
        Category category = categoryRepository.findByName(categoryEditRequest.getOldName());
        if (!categoryEditRequest.getNewName().isEmpty()) {
            category.setName(categoryEditRequest.getNewName());
        }
        category.setSection(sectionRepository.findByName(categoryEditRequest.getNewSectionName()));
        categoryRepository.updateCategory(category);
    }
}
