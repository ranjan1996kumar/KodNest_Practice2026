package this_method;

public class Demo2 extends Demo1{
	int age;
	
	
	Demo2(int id, String name, int age) {
		this();
		this.age = age;
	}
	Demo2() {
		this(21);
		}
	Demo2(int age) {
		super(103);
		this.age = age;
	}
	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}
}
