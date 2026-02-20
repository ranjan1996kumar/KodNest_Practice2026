import java.util.Scanner;

public class CountDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();

        int count = 0;

        // Handle zero separately
        if (num == 0) {
            count = 1;
        } else {
            // Make number positive (for negative inputs)
            num = Math.abs(num);

            while (num > 0) {
                num = num / 10;
                count++;
            }
        }

        System.out.println("Number of digits = " + count);

        sc.close();
		

	}
}
