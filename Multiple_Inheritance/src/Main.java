class A {
    void display() {
        System.out.println("Display from A");
    }
}

class B extends A {
    void display() {
        System.out.println("Display from B");
    }
}

class C extends A {
    void display() {
        System.out.println("Display from C");
    }
}

// This is not allowed in Java
class D extends B {
    // Which display() should D inherit? B's or C's?
}

public class Main {
    public static void main(String[] args) {
        D obj = new D();
        obj.display(); // Ambiguity!
    }
}