package guru.springframework.repositories;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import guru.springframework.domain.Product;

/**
 * Created by jt on 1/10/17.
 */
public interface ProductRepository extends JpaRepository<Product, Long> ,CrudRepository<Product, Long> {
	
	List<Product> findByName(String name);
	List <Product> findByNameIgnoreCase(String name);
	//List <Product> findByNameORDescriptionAllIgnoreCase(String name,String description);
	//List <Product> findProductDistinctByNameORDescriptionAllIgnoreCase(String name,String description);
	 Stream<Product> findByNameContaining(String name);
}
