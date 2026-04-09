package Default;

class OuterClass
{
    int a = 10;

    class InnerClass
    {
        int b = 20;

        void innerDisplay() {
            System.out.println("Inner class display method is called");
            System.out.println(b);
            System.out.println(a); // Accessing outer class member
        }
    }

    void outerDisplay() {
        System.out.println("Outer class display method is called");
        System.out.println(a);
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        // 1. Create object of OuterClass
        OuterClass oc = new OuterClass();
        oc.outerDisplay();

        // 2. Create object of InnerClass using the OuterClass reference
        OuterClass.InnerClass ic = oc.new InnerClass();
        ic.innerDisplay();
    }
}

//1-Access: The InnerClass has direct access to the members (like int a) of the OuterClass.
//
//2-Instantiation: To create an instance of a non-static inner class, you must first have an instance of the outer class (oc.new InnerClass()).
//
//3-Organization: This structure is used to logically group classes that are only used in one place, increasing encapsulation.





