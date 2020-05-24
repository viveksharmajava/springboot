package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.domain.Feature;

public interface FeatureRepository  extends CrudRepository<Feature, Long>{

}
