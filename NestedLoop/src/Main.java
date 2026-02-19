public class Main {
	public static void main(String[] args) 
	{
		// do while inside for loop
		for(int i =1; i <= 10; i *= 2) 
		{
			int j = 1;
			while(j < 10)
			{
				int k = 1;
				do 
				{
					System.out.println("i: " + i + " j: " + j + " k: " + k);
					k *= 2;
				}
				while (k <= 10);
				j *= 2;
			}
		}
	}
}