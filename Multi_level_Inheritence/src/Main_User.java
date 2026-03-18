class User {
	String name;
	int userId;
	
	public void displayUserDetails() 
	{
		System.out.println("User ID: " + userId + ", Name: " + name);
	}
}

class Student extends User {
	String grade;
	
	public void displayStudentDetails() {
		displayUserDetails(); // inherited from User
		System.out.println("Grade:" + grade);
	}
}

class Teacher extends User {
	String subject;
	
	public void displayTeacherDetails() {
			displayUserDetails(); // inherited from User System.out.println("Subject: + subject);
			System.out.println("Subject: " + subject);
	}
}

public class Main_User {
		public static void main(String[] args) {
		Student student = new Student();
		student.name = "John";
		student.userId = 101;
		student.grade = "A";
		student.displayStudentDetails();
		Teacher teacher = new Teacher();
		teacher.name = "Mr. Smith";
		teacher.userId = 201;
		teacher.subject = "Mathematics";
		teacher.displayTeacherDetails();
		}
}
