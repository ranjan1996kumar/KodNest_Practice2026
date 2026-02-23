// F1 Race Project

public class F1_Race {
	public static void main(String[] args) {
		int speed = 0;
		for(int i = 1; i <= 10; i++)
		{
			speed += 25;
			if((speed > 100) && (i < 6))
			{
				break;
			}
		}
		System.out.println("I WON");
	}
}
