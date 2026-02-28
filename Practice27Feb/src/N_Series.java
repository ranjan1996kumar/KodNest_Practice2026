// Find the n-th term of the series 1, 3, 6, 10, 15, 21... using the formula $\frac{n(n+1)}{2}$.
import java.util.Scanner;

public class N_Series {
	public static void main(String[] args) {
        // Use Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        // Find and print the n-th term of the series
        int term = n * (n + 1) / 2;
        
        System.out.println("The " + n + "th term of the series is " + term + ".");
        
        scanner.close();
        }
}
