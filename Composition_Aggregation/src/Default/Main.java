package Default;

//Aggregation: Bike can exist on its own
class Bike {
 String brand = "Hero Honda";
 void ride() {
     System.out.println("Riding the " + brand + " ZMR Bike.");
 }
}

//Composition: Brain is strictly tied to the Person
class Brain {
 void think() {
     System.out.println("Brain is processing...");
 }
}

class Person {
 // Composition: Created internally. If Person is destroyed, Brain is destroyed.
 Brain brain = new Brain(); 
 
 // Aggregation: Passed in from outside. If Person is destroyed, Bike remains.
 Bike bike; 

 void setBike(Bike bike) {
     this.bike = bike;
 }
}

//Inheritance: Student IS-A Person
class Student extends Person {
 void study() {
     System.out.println("Student is studying using their brain.");
     brain.think(); // Accessing the composed part
 }
}

public class Main {
 public static void main(String[] args) {
     // Create the independent object (Aggregation)
     Bike commonBike = new Bike();

     // Create the Student
     Student s = new Student();
     s.setBike(commonBike); 

     s.study();
     
     if (s.bike != null) {
         s.bike.ride();
     }

     // Logic Check: 
     // If we delete 's', the 'brain' inside it is gone.
     // However, 'commonBike' still exists and can be given to another person.
 }
}