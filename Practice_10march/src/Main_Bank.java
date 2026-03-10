public class Main_Bank {
	public static void main(String[] args) {
		Bank b = new Bank();
		b.withdraw(4444, 2000);
		System.out.println(b.checkBalance());
	}
}
