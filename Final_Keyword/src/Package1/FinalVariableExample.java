package Package1;

public class FinalVariableExample {
    // Final variable
    final int MAX_SPEED = 120;

    public void displaySpeed() {
        // MAX_SPEED = 150; // This would cause a compile-time error
        System.out.println("The maximum speed is: " + MAX_SPEED);
    }

    public static void main(String[] args) {
        FinalVariableExample example = new FinalVariableExample();
        example.displaySpeed();
    }
}
