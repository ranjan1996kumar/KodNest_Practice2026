package Package1;

class Animal {
	
}

class Tiger extends Animal {
	
}

class Parent {
	Animal display() {
		System.out.println("Hi");
		Animal a = new Animal();
		return a;
	}
}

class Child extends Parent {
	@Override
	Tiger display() {
		System.out.println("Hello");
		Tiger t = new Tiger();
		return t;
	}
}
public class Main {
	public static void main(String[] args) {
		
	}
}
