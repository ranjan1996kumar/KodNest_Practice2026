package Package1;

//class Animal {
//	
//}
//
//class Tiger extends Animal {
//	
//}

class Parent {
	int i = 10; 
		void display() {
			System.out.println("Hi");
			System.out.println(i);
		}
		
		void demo() {
			System.out.println("Welcome");
		}
}

class Child extends Parent {
	int i = 100;
	@Override
	void display() {
		System.out.println("Hello");
		System.out.println(super.i);
		System.out.println(i);
		super.demo();
	}
}
public class Main {
	public static void main(String[] args) {
		Child c = new Child();
		c.display();
	}
}
