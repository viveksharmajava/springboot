package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.domain.FeatureType;

public interface FeatureTypeRepository extends CrudRepository<FeatureType, Long>{

}
