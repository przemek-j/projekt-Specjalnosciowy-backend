package fullstack.springbootbackend.repository;

import fullstack.springbootbackend.model.Category;
import fullstack.springbootbackend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByCategory_Id(Long id);
    List<Product> findAllByCategory(Category category);
    List<Product> findAllByName(String name);
}
