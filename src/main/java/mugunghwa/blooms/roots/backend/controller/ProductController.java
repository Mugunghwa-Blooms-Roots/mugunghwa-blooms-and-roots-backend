package mugunghwa.blooms.roots.backend.controller;

import lombok.RequiredArgsConstructor;
import mugunghwa.blooms.roots.backend.entity.Product;
import mugunghwa.blooms.roots.backend.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<Page<Product>> getAllProducts(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "12") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String direction
    ) {
        Page<Product> products = productService.getAllProducts(page, size, sortBy, direction);

        return ResponseEntity.ok(products);
    }

    @GetMapping("/catogory/{categoryId}")
    public ResponseEntity<Page<Product>> getProductsByCategory(
        @PathVariable Long categoryId,
        @RequestParam(defaultValue = "0") int page,
        @RequestParam(defaultValue = "12") int size
    ) {
        Page<Product> products = productService.getProductsByCategory(categoryId, page, size);

        return ResponseEntity.ok(products);
    }

}
