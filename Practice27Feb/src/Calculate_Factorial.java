//Calculate the factorial of a given non-negative integer $n$ (denoted as $n!$).
import java.util.Scanner;

public class Calculate_Factorial {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Write your code here
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + n + " is " + fact);
        scanner.close();
    }
}
