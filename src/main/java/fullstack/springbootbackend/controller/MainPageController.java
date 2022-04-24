package fullstack.springbootbackend.controller;

import fullstack.springbootbackend.model.Category;
import fullstack.springbootbackend.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class MainPageController {
    @Autowired
    CategoryRepo categoryRepo;
    @RequestMapping("categories")
    public HashMap<String, Object> getCategories(){
        var sections = new ArrayList<>();
        List<Category> categories = categoryRepo.findAll();
        System.out.println(categories);
        HashMap<String, Object> section = new HashMap<>();
        for (Category category : categories){
            sections.add(getsection(category));
        }
        var endpoint = new HashMap<String, Object>();
        endpoint.put("sections", sections);
        return endpoint;
    }

    HashMap<String,Object> getsection(Category c){
        var section = new HashMap<String, Object>();
        section.put("title", c.getName().toLowerCase(Locale.ROOT));
        section.put("image", c.getImage() );
        section.put("id", c.getId());
        return section;
    }
}
