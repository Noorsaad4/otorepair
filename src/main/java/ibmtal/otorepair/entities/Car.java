package ibmtal.otorepair.entities;


	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToOne;
	import javax.persistence.Table;

	@Entity
	@Table(name="cars")
	public class Car {
		@Id
		@GeneratedValue(strategy =GenerationType.AUTO )
		@Column(name="id")
		private int id;
		@Column(name="name")	
		private String name;
		@ManyToOne()
		@JoinColumn(name="brand")
		private String brand;
		@Column(name="price")
		private double price;
		@Column(name="plaka")
		private String plaka;
		@Column(name="model")
		private String model;
		@Column(name="color")
		private String color;
		private costumer costumer;
		public Car() {
			super();
		}
		public Car(int id, String name,String brand, double price) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
			this.brand=brand;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
	
		public Car(String plaka, String model, String color, ibmtal.otorepair.entities.costumer costumer) {
			super();
			this.plaka = plaka;
			this.model = model;
			this.color = color;
			this.costumer = costumer;
		}
		public String getPlaka() {
			return plaka;
		}
		public void setPlaka(String plaka) {
			this.plaka = plaka;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public costumer getCostumer() {
			return costumer;
		}
		public void setCostumer(costumer costumer) {
			this.costumer = costumer;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		
	}


