package Default;

public class OS {
	String name;
	float size;
	public OS(String name, float size) {
		this.name = name;
		this.size = size;
	}
	void OSDetails() {
		System.out.println("OS Name: " + name);
		System.out.println("OS Size: " + size + "GB");
	}
	
}
