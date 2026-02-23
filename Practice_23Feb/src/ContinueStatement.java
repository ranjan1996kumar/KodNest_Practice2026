//calculate the sum of all numbers from 1 to 10, but you want to skip adding the numbers that are multiple of 3.
public class ContinueStatement {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) 
		{
			if(i % 3== 0) 
			{
				System.out.println("Numbers " + i + " is skipped.");
				continue;
			}
			sum += i;
			System.out.println("Number " + i + "is added. Current sum: " + sum);
		}
		System.out.println("FInal sum: " + sum);
	}
}
