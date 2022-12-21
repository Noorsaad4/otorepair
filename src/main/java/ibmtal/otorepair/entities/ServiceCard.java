package ibmtal.otorepair.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ServiceCard {


	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private int id;
	@Column(name="id")
	private String ServiceDate;
	@Column(name="servicedate")
	private Car car;
	@Column(name="price")
	private int price;
	public ServiceCard() {
		super();
	}
	public ServiceCard(int id, String serviceDate, Car car, int price) {
		super();
		this.id = id;
		ServiceDate = serviceDate;
		this.car = car;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getServiceDate() {
		return ServiceDate;
	}
	public void setServiceDate(String serviceDate) {
		ServiceDate = serviceDate;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
