package guru.springframework.commands;


import java.math.BigDecimal;

/**
 * Created by jt on 1/10/17.
 */
public class ProductForm {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private String imageUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
