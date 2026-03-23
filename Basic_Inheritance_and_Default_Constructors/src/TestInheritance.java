class Animal {
    // Constructor of Animal class
    public Animal() {
        System.out.println("An animal is created.");
    }
}

class Dog extends Animal {
    // Constructor of Dog class
    public Dog() {
        // The compiler implicitly inserts super() here
        System.out.println("A dog is created.");
    }
}

public class TestInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // Creating an instance of Dog
    }
}