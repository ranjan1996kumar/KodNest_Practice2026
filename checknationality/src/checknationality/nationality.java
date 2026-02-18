package checknationality;
import java.util.Scanner;

public class nationality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your nationality");
		String nationality = sc.nextLine();
		
		switch (nationality) {
		case "Indian":
			System.out.println("Enter Your Age");
			int age = sc.nextInt();
			if(age>=18) {
				System.out.println("You are eligible to vote in India");
			}
			else {
				System.out.println("You are not eligible to vote in India");
			}
			break;
		default:
			System.out.println("You are not eligible to vote");
		}
	}
}

