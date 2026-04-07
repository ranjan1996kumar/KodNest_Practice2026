package Package1;
//This code demonstrates how abstract methods provide a structure that subclasses must implement.

abstract class KodnestMentor {
    // Declare abstract methods that all mentors must implement
    public abstract void teachConcepts();
    public abstract void groomForDrives();
}

class JavaMentor extends KodnestMentor {
    // Implement methods specifically for Java mentors
    public void teachConcepts() {
        System.out.println("Java mentor teaches Java concepts.");
    }

    public void groomForDrives() {
        System.out.println("Java mentor grooms for back-end drives.");
    }
}

class ReactMentor extends KodnestMentor {
    // Implement methods specifically for React mentors
    public void teachConcepts() {
        System.out.println("React mentor teaches React concepts.");
    }

    public void groomForDrives() {
        System.out.println("React mentor grooms for front-end drives.");
    }
}

public class EducationSystem {
    public static void main(String[] args) {
        KodnestMentor javaMentor = new JavaMentor();
        KodnestMentor reactMentor = new ReactMentor();

        javaMentor.teachConcepts(); // Output: Java mentor teaches Java concepts.
        javaMentor.groomForDrives(); // Output: Java mentor grooms for back-end drives.
        reactMentor.teachConcepts(); // Output: React mentor teaches React concepts.
        reactMentor.groomForDrives(); // Output: React mentor grooms for front-end drives.
    }
}