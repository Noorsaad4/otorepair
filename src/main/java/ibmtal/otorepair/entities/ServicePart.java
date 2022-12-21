package ibmtal.otorepair.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ServicePart {

	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private int id;
	@Column(name="id")
	private ServiceCard servicecard;
	@Column(name="otopartName")
	private String otopartName;
	@Column(name="quantity")
	private int quantity;
	@Column(name="price")
	private int price;
	public ServicePart() {
		super();
	}
	public ServicePart(int id, ServiceCard servicecard, String otopartName, int quantity, int price) {
		super();
		this.id = id;
		this.servicecard = servicecard;
		this.otopartName = otopartName;
		this.quantity = quantity;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ServiceCard getServicecard() {
		return servicecard;
	}
	public void setServicecard(ServiceCard servicecard) {
		this.servicecard = servicecard;
	}
	public String getOtopartName() {
		return otopartName;
	}
	public void setOtopartName(String otopartName) {
		this.otopartName = otopartName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
