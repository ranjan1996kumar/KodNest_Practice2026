class Student{
	static {
		System.out.println("static block is executed");
	}
	{
		System.out.println("Instance block is executed");
	}
	public Student() {
		System.out.println("COnstructor is executed");
	}
}

public class Main_Student {
	public void main (String[] args) {
	Student s1 = new Student();
	Student s2 = new Student();
	}
}