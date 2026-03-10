public class Bank {
	private int accNo = 1234;
	private int balance = 10000;
	private int pin = 4444;
	
	void withdraw(int pinNo, int amount) {
		if (pinNo == pin && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
		}
		else {
			System.out.println("You have entered invalid pin or insufficient balance");
		}
	}
	int checkBalance() {
		return balance;
	}
}
