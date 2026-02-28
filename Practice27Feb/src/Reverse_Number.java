//Reverse the digits of a given integer (e.g., 12345 becomes 54321).
public class Reverse_Number {
	public static void main(String[] args) {
        // Declare and initialize the number variable
        int number = 12345;
        int reversedNumber = 0;

        // Reverse the number using a while loop
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }

        // Print the reversed number
        System.out.println("Reversed Number: " + reversedNumber);
    }
}
