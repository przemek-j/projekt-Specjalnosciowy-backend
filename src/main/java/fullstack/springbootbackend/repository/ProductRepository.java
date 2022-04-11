package fullstack.springbootbackend.repository;

import fullstack.springbootbackend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value = "SELECT* FROM products WHERE title = 'Hats'",
    nativeQuery = true)
    List<Product> findAllHats();

    @Query(value = "SELECT * FROM products WHERE title = 'Sneakers'",
            nativeQuery = true)
    List<Product> findAllSneakers();

    @Query(value = "SELECT * FROM products WHERE title = 'Womens'",
            nativeQuery = true)
    List<Product> findAllWomens();

    @Query(value = "SELECT * FROM products WHERE title = 'Mens'",
            nativeQuery = true)
    List<Product> findAllMens();

    @Query(value = "SELECT * FROM products WHERE title = 'Watches'",
            nativeQuery = true)
    List<Product> findAllWatches();

    @Query(value = "SELECT * FROM products WHERE title = 'Jewelry'",
            nativeQuery = true)
    List<Product> findAllJewelry();

    @Query(value = "SELECT * FROM products WHERE title = 'Jackets'",
            nativeQuery = true)
    List<Product> findAllJackets();

    @Query(value = "SELECT * FROM products WHERE title = 'Kids'",
            nativeQuery = true)
    List<Product> findAllKids();

    @Query(value = "SELECT * FROM products WHERE title = 'Pregnancy'",
            nativeQuery = true)
    List<Product> findAllPregnancy();
}
