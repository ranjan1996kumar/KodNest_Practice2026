import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	// Use Scanner to take user input
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("User Information:");

	// Take user input for various details

	byte userId = scanner.nextByte();
	short age = scanner.nextShort();
	long phoneNumber = scanner.nextLong();
	long nationalId = scanner.nextLong();
	float height = scanner.nextFloat();
	double weight = scanner.nextDouble();
	char gender = scanner.next().charAt(0);
	boolean isMarried = scanner.nextBoolean();

	scanner.nextLine();

	// Consume the newline left-over
	String name = scanner.nextLine();

	// Print the collected information
	System.out.println("User ID: " + userId);
	System.out.println("Age: " + age);
	System.out.println("Phone Number: " + phoneNumber);
	System.out.println("National ID: " + nationalId);
	System.out.println("Height: " + height + " meters");
	System.out.println("Weight: " + weight + "kg");
	System.out.println("Gender:" + gender);
	System.out.println("Married: " + isMarried);
	System.out.println("Name: " + name);

	scanner.close();
	}
}