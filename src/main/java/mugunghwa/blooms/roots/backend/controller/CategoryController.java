package mugunghwa.blooms.roots.backend.controller;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import mugunghwa.blooms.roots.backend.entity.Category;
import mugunghwa.blooms.roots.backend.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/vi/categories")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/root")
    public ResponseEntity<List<Category>> getRootCategories() {
        List<Category> roots = categoryService.getRootCategories();

        return ResponseEntity.ok(roots);
    }

    @GetMapping
    public ResponseEntity<List<Category>> getAllCategories() {
        return ResponseEntity.ok(categoryService.getAllCategories());
    }
}
