package Package2;

//Polymorphism and Method Overriding
//This code shows how a parent class reference (Polymorphism) can be used to call overridden methods in subclasses.


abstract class Mentor {
    public void trainInterns() {
        System.out.println("train interns on something...");
    }

    public void takeAttendance() {
        System.out.println("take attendance of interns...");
    }
}

class JavaMentor extends Mentor {
    public void trainInterns() {
        System.out.println("train interns on Java...");
    }

    public void takeAttendance() {
        System.out.println("take Java session attendance of interns...");
    }
}

class SqlMentor extends Mentor {
    public void trainInterns() {
        System.out.println("train interns on SQL...");
    }

    public void takeAttendance() {
        System.out.println("take SQL session attendance of interns...");
    }
}

public class Main {
    public static void main(String[] args) {
        JavaMentor ji = new JavaMentor();
        SqlMentor si = new SqlMentor();

        startSession(ji);
        startSession(si);
    }

    public static void startSession(Mentor men) {
        men.trainInterns();
        men.takeAttendance();
    }
}