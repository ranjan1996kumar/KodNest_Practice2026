//Find the sum of the first 50 natural numbers using a for loop.
public class Natural_Numbers_Sum {
	public static void main(String[] args) {
        // Calculate the sum of the first 50 natural numbers
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of the first 50 natural numbers is " + sum + ".");
    }
}
