package Default;

@FunctionalInterface
interface Demo 
{
    void display();
}

class Program implements Demo {
    
    @Override
    public void display() {
        System.out.println("Welcome");
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Program p = new Program();
        p.display();
    }
}
//@FunctionalInterface: An annotation ensuring the interface has exactly one abstract method.
//Implementation: The class Program provides the body for the display() method.
//Execution: The Main class creates an object of Program and invokes the method to print "Welcome".
//functional interface has only one abstract method and lambda expression also both has came with java 8
//lambda expression, we can give it only for functional interface