package package1;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    float add(int a, float b) {
        return a + b;
    }

    float add(float a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    float add(int a, int b, float c) {
        return a + b + c;
    }

    double add(int b, double c) {
        return b + c;
    }

    double add(double c, double d) {
        return c + d;
    }

    double add(double a, double b, double c) {
        return a + b + c;
    }
}


public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        
        c.add(10, 20);
        c.add(10, 20, 30);
        c.add(67.89f, 56.78f, 56.89f); // Note: This matches the 3-parameter double/float logic
        c.add(40, 89.89f);
        c.add(34.34f, 98);
        c.add(40, 89.68);
    }
}






