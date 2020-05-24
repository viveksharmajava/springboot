package guru.springframework.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
@Entity
public class Feature {
  @Id
  private String featureId;
  private String featureName;
  
  // @OneToOne(mappedBy ="typeId")
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "featureType", referencedColumnName = "typeId")
   private  FeatureType featureType;
  
  @ManyToMany(fetch = FetchType.LAZY, mappedBy="features")
  private Set<Product> products = new HashSet();
	
public String getFeatureId() {
	return featureId;
}

public void setFeatureId(String featureId) {
	this.featureId = featureId;
}

public String getFeatureName() {
	return featureName;
}

public void setFeatureName(String featureName) {
	this.featureName = featureName;
}

public FeatureType getFeatureType() {
	return featureType;
}

public void setFeatureType(FeatureType featureType) {
	this.featureType = featureType;
}
}
