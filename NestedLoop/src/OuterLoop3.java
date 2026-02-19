public class OuterLoop3 
{
	public static void main(String[] args)
	{
		OuterLoop3:

				for(int num1 = 1; num1 <= 10; num1++) 
				{

				for(int num2 = 1; num2 <= 10; num2++) 
				{

				if(num1 * num2 == 25)
				{
					System.out.println("Found a pair: " + num1 + "and" + num2 + "whose product is 25");
					break OuterLoop3; // Exit all loops immediately
				}
				
				}
				
				}
	}
}
		
