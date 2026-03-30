package Default;

public class Program {
	public static void main(String[] args) {
		Mobile m = new Mobile("SAMSUNG" , 35000, "Android", 2.5f);
		Charger c = new Charger(10, 'C');
		c.chargerDetails();
		
		m.mobileDetails();
		m.chargeMobile(c);
	}
}
