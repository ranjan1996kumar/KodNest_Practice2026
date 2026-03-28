package Package1;


class Parent {
    // Final method
    final void show() {
        System.out.println("This is a final method from the Parent class.");
    }
}

class Child extends Parent {
    // Attempting to override show() here would cause a compile-time error
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.show();
    }
}

