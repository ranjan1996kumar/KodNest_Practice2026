class Person {
	String name;
	int age;
	
	public Person() {
		super();
		System.out.println("Parent constructor is executing");
	}
}

class Student extends Person {
	int marks;
	
	public Student() {
		super(); // calling parent constructor
		System.out.println("Student constructor is executing");
	}
}
public class Main {
	public static void main(String[] args) {
		Student s = new Student();
	}
}


/*
 * Another example
class Person {
    String name;
    int age;

    public Person() {
        name = "KodNest";
        age = 23;
    }
}
class Student extends Person {
    int marks;

    public Student(String name, int age, int marks) {
        this.marks = marks;
    }

    void display() {
        System.out.println("Student details: " + name + " " + age + " " + marks);
    }
}
public class Main {
    public static void main(String[] args) {
        Student s = new Student("Akash", 22, 95);
        s.display();
    }
}
*/



