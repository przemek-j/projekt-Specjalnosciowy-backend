package fullstack.springbootbackend.controller;

import fullstack.springbootbackend.model.Category;
import fullstack.springbootbackend.repository.CategoryRepo;
import fullstack.springbootbackend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepo categoryRepo;

    // get all products
    @GetMapping("/products")
    public HashMap<String, Object> getAllProducts() {
        var products = new HashMap<String, Object>();
        List<Category> categories = categoryRepo.findAll();

        for (Category category : categories){
            products.put(category.getName().toLowerCase(Locale.ROOT), getCategory(category));
        }
        return products;
    }

    HashMap<String,Object> getCategory(Category c){
        var category = new HashMap<String, Object>();
        category.put("title", c.getName());
        category.put("routeName", c.getName().toLowerCase(Locale.ROOT));
        category.put("id", c.getName().toLowerCase(Locale.ROOT));
        category.put("items", c.getProducts());
        return category;
    }
}
