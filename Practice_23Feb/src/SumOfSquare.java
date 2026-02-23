//Calculate and print the sum of squares of numbers from 1 to N skipping multiples of 4 using continue statement.
import java.util.Scanner;

public class SumOfSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= N; i++)
		{
			if(i % 4 == 0)
			{
				continue;
			}
			sum += i * i;
		}
		System.out.println("Sum of Squares: " + sum);
		
		sc.close();
	}

}
