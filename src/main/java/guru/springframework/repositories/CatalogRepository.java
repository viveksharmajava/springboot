package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.domain.Catalog;

public interface CatalogRepository extends CrudRepository<Catalog, Long> {

}
