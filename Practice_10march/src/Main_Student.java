class Student {
    private int rollNumber;
    private String name;
    private int age;

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setRollNumber(int rollN) {
        rollNumber = rollN;
    }

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        if (a > 0) {
            age = a;
        } else {
            System.out.println("Invalid age. Age must be positive.");
        }
    }
}

public class Main_Student {
	public static void main(String[] args) {
        Student student1 = new Student();
        student1.setRollNumber(101);
        student1.setName("Alice");
        student1.setAge(20);

        System.out.println("Initial Student Details:");
        System.out.println("Roll Number: " + student1.getRollNumber());
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());

        student1.setName("Alicia");
        student1.setAge(-5);
        student1.setAge(21);

        System.out.println("\nFinal Student Details:");
        System.out.println("Roll Number: " + student1.getRollNumber());
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
    }
}
