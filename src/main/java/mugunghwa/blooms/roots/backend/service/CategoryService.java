package mugunghwa.blooms.roots.backend.service;

import lombok.RequiredArgsConstructor;
import mugunghwa.blooms.roots.backend.entity.Category;
import mugunghwa.blooms.roots.backend.repository.CategoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    @Transactional(readOnly = true)
    public List<Category> getRootCategories() {
        return categoryRepository.findByParentCategoryIsNull();
    }

    @Transactional(readOnly = false)
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
