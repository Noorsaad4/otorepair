package ibmtal.otorepair.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class costumer {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="name")
	@Column(name="surname")
	@Column(name="phone")
	private int phone;
	private String name;
	private String surname;
	public costumer() {
		super();
	}
	public costumer(int id, int phone, String name, String surname) {
		super();
		this.id = id;
		this.phone = phone;
		this.name = name;
		this.surname = surname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
}
