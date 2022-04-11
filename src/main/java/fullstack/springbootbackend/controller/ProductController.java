package fullstack.springbootbackend.controller;

import fullstack.springbootbackend.model.Product;
import fullstack.springbootbackend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    // get all products
    @GetMapping("/products")
    public HashMap<String, Object> getAllProducts() {
        var collection = new HashMap<String, Object>();

        var productsHats = new HashMap<String, Object>();
        productsHats.put("title", "Hats");
        productsHats.put("routeName", "hats");
        productsHats.put("id", "hats");
        productsHats.put("items", productRepository.findAllHats());
        collection.put("hats", productsHats);

        var productsSneakers = new HashMap<String, Object>();
        productsSneakers.put("title", "Sneakers");
        productsSneakers.put("routeName", "sneakers");
        productsSneakers.put("id", "sneakers");
        productsSneakers.put("items", productRepository.findAllSneakers());
        collection.put("sneakers", productsSneakers);

        var productsWomens = new HashMap<String, Object>();
        productsWomens.put("title", "Womens");
        productsWomens.put("routeName", "womens");
        productsWomens.put("id", "womens");
        productsWomens.put("items", productRepository.findAllWomens());
        collection.put("womens", productsWomens);

        var productsMens = new HashMap<String, Object>();
        productsMens.put("title", "Mens");
        productsMens.put("routeName", "mens");
        productsMens.put("id", "mens");
        productsMens.put("items", productRepository.findAllMens());
        collection.put("mens", productsMens);

        var productsWatches = new HashMap<String, Object>();
        productsWatches.put("title", "Watches");
        productsWatches.put("routeName", "watches");
        productsWatches.put("id", "watches");
        productsWatches.put("items", productRepository.findAllWatches());
        collection.put("watches", productsWatches);

        var productsJewelry = new HashMap<String, Object>();
        productsJewelry.put("title", "Jewelry");
        productsJewelry.put("routeName", "jewelry");
        productsJewelry.put("id", "jewelry");
        productsJewelry.put("items", productRepository.findAllJewelry());
        collection.put("jewelry", productsJewelry);

        var productsJackets = new HashMap<String, Object>();
        productsJackets.put("title", "Jackets");
        productsJackets.put("routeName", "jackets");
        productsJackets.put("id", "jackets");
        productsJackets.put("items", productRepository.findAllJackets());
        collection.put("jackets", productsJackets);

        var productsKids = new HashMap<String, Object>();
        productsKids.put("title", "Kids");
        productsKids.put("routeName", "kids");
        productsKids.put("id", "kids");
        productsKids.put("items", productRepository.findAllKids());
        collection.put("kids", productsKids);

        var productsPregnancy = new HashMap<String, Object>();
        productsPregnancy.put("title", "Pregnancy");
        productsPregnancy.put("routeName", "pregnancy");
        productsPregnancy.put("id", "pregnancy");
        productsPregnancy.put("items", productRepository.findAllPregnancy());
        collection.put("pregnancy", productsPregnancy);

        return collection;
    }
}
