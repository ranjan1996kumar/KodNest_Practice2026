package Default;

public class Mobile {
	String brand;
	int price;
	OS os;
	public Mobile(String brand, int price, String name, float size) {
		
		this.brand = brand;
		this.price = price;
		os = new OS(name, size);
	}
	void mobileDetails() {
		System.out.println("Brand Name: " + brand);
		System.out.println("Price: " + price + "rupees");
		os.OSDetails();
	}
	void chargeMobile(Charger ch) {
		ch.chargerDetails();
	}
	
}
