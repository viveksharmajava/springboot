package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.domain.ProductType;

public interface CatalogTypeRepository extends CrudRepository<ProductType, Long>{

}
