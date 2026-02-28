//Print the first $N$ numbers of the Fibonacci series.
import java.util.*;

public class Fibonacci_Series {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        int n = scanner.nextInt();

        int a = 0, b = 1;
        int count = 0;
        System.out.println("The first " + n + " Fibonacci numbers are:");

        while (count < n) {
            System.out.println(a);

            int next = a + b;
            a = b;
            b = next;
            count++;
            
            scanner.close();
        }
    }
}
