class Student {
    String studentName;
    int rollNumber;
    String course;

    // Parameterized Constructor
    public Student(String name, int rollNo, String courseName) {
        studentName = name;
        rollNumber = rollNo;
        course = courseName;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }
}

public class Main_Student {
    public static void main(String[] args) {
        Student student1 = new Student("Alice Brown", 201, "Mathematics");
        Student student2 = new Student("Bob Green", 202, "Physics");
        Student student3 = new Student("Charlie Black", 203, "Chemistry");

        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}

