class Student_Onboarding {
    int id;
    String name;

    // Static block
    static {
        System.out.println("Welcome to student onboarding process");
    }

    // Instance block
    {
        System.out.println("Student object is getting created");
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {

        // Object 1
        Student_Onboarding s1 = new Student_Onboarding();
//        s1.id = 101;
//        s1.name = "Ranjan";
//        s1.display();

        // Object 2
        Student_Onboarding s2 = new Student_Onboarding();
//        s2.id = 102;
//        s2.name = "Rahul";
//        s2.display();

        // Object 3
        Student_Onboarding s3 = new Student_Onboarding();
//        s3.id = 103;
//        s3.name = "Ankit";
//        s3.display();
    }
}