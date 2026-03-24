package this_method;

public class Demo1 {
	int id;
	String name;
	
	Demo1() {
		this(109, "Scahin");
	}
	Demo1(int id, String name) {
		super();
		this.id = id;
		this.name =  name;
		}
	Demo1(int id) {
		this();
		this.id = 100;
	}
}
