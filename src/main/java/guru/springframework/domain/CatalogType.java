package guru.springframework.domain;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class CatalogType {

	@Id
	private String typeId;
	private String typeName;
	public String getTypeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
}