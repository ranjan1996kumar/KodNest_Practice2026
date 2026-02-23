//Print all odd numbers in a given range using continue statement
import java.util.Scanner;

public class OddNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.print("Odd Numbers: ");
		for(int i = 1; i <= N; i++)
		{
			if(i % 2 != 1)
			{
				continue;
			}
			System.out.print(" " + i);
		}
		sc.close();
	}
}
