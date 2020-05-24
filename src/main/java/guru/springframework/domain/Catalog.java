package guru.springframework.domain;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
@Entity
public class Catalog {
	
	@Id
	private String catalogId;
	private String catalogName;
	private String description;
	private String imageUrl;
	private Timestamp startTime;
	private Timestamp endTime;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "catalogTypeId", referencedColumnName = "typeId")
    private  CatalogType catalogType;
	  
	@ManyToMany(mappedBy = "catalogs", fetch = FetchType.LAZY)
    private Set<Category> categories = new HashSet<>();
	
	
	public Set<Category> getCategories() {
		return categories;
	}
	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}
	public String getCatalogId() {
		return catalogId;
	}
	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}
	public String getCatalogName() {
		return catalogName;
	}
	public void setCatalogName(String catalogName) {
		this.catalogName = catalogName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public Timestamp getStartTime() {
		return startTime;
	}
	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}
	public Timestamp getEndTime() {
		return endTime;
	}
	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}
	public CatalogType getCatalogType() {
		return catalogType;
	}
	public void setCatalogType(CatalogType catalogType) {
		this.catalogType = catalogType;
	}
	

}
