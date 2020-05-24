package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.domain.CategoryType;

public interface CategoryTypeRepository  extends  CrudRepository<CategoryType, Long>{

}
