package guru.springframework.domain;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

@Entity
public class Category {
	@Id
	private String categoryId;
	private String categoryName;
	private String description;
	private String imageUrl;
	private Timestamp startTime;
	private Timestamp endTime;
	
   @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
   @JoinTable(name="CategoryCatalog",joinColumns=@JoinColumn(name="categoryId", referencedColumnName="categoryId"),
   inverseJoinColumns=@JoinColumn(name="catalogId", referencedColumnName="catalogId"))
   private Set<Catalog> catalogs = new HashSet();

   @ManyToMany(fetch = FetchType.LAZY, mappedBy="categories")
   private Set<Product> products = new HashSet();

   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "categoryTypeId", referencedColumnName = "typeId")
   private  CategoryType categoryType;
   
	public Set<Catalog> getCatalogs() {
	return catalogs;
	}
	public void setCatalogs(Set<Catalog> catalogs) {
		this.catalogs = catalogs;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	public CategoryType getCategoryType() {
		return categoryType;
	}
	public void setCategoryType(CategoryType categoryType) {
		this.categoryType = categoryType;
	}
	

}
