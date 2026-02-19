public class outerLoop
{
	public static void main(String[] args) 
	{
		for (int i = 1; i<= 5; i++) 
		{
			outerLoop:
				
			for (int j = 1; j <= 5; j++) 
			{

			if (i* j > 10) 
			{

			System.out.println("Breaking out of both loops!");

			break outerLoop; // Jumping out of all the loops!

			}
			
			}
			
		}
		
	}
}
