package Default;

class Vehicle {
    public void drive() {
        System.out.println("Drive vehicle to travel!");
    }
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Drive car to travel!");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Car();  // Upcasting happens here
        v.drive();              // Output: Drive car to travel!
    }
}