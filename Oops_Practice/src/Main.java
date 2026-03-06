public class Main {
	public static void main(String[] args) {
		Employees e1 = new Employees();
		e1.id = 101;
		e1.name = "Ajay";
		e1.salary = 50000;
		
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.salary);
		
		e1.work();
		e1.attendMeeting();
	}
}
