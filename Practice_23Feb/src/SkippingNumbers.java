//Print all numbers from 1 to N skipping multiples of both 3 and 5 using continue statement.
import java.util.Scanner;

public class SkippingNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.print("Numbers: ");
		for(int i = 1; i <= N; i++) 
		{
			if(i % 15 == 0)
			{
				continue;
			}
			System.out.print(i + " ");
		}
		sc.close();
	}
}
