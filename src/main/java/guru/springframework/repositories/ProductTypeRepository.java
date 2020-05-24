package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.domain.ProductType;

public interface ProductTypeRepository extends CrudRepository<ProductType, Long>  {

}
