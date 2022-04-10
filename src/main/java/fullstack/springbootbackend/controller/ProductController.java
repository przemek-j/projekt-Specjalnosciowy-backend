package fullstack.springbootbackend.controller;

import fullstack.springbootbackend.model.Product;
import fullstack.springbootbackend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    // get all products
    @GetMapping("/products")
    //public List<Product> getAllProducts() {
        //return productRepository.findAll();
    //}
    public Map<String, List<Product>> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products.collect(Collectors.groupingBy(w -> w.title));
    }


}
