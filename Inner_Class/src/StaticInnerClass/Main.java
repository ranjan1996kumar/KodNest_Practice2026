package StaticInnerClass;

class OuterClass
{
    static int a = 10;

    static class InnerClass
    {
        static int b = 20;
        int c = 30;

        static void innerDisplay() {
            System.out.println("Inner class static display method is called");
            System.out.println(b);
            // System.out.println(a); // Can access static members of OuterClass
        }

        void disp() {
            System.out.println("Inner class non static display method is called");
            System.out.println(b);
            System.out.println(c);
        }
    }

    static void outerDisplay() {
        System.out.println("Outer class static display method is called");
        System.out.println(a);
        System.out.println(InnerClass.b);
        InnerClass.innerDisplay();
        
        InnerClass ic = new InnerClass();
        System.out.println(ic.c);
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        OuterClass.outerDisplay();

        OuterClass.InnerClass.innerDisplay();

        OuterClass.InnerClass ic = new OuterClass.InnerClass();
        ic.disp();
    }
}

//1-Static Inner Class: Unlike a regular inner class, a static inner class does not require an instance of the OuterClass to be instantiated.
//
//2-Access Rules: * Static methods in the inner class can only access static members of the outer class.
//
//--The OuterClass can access the inner class's static members using the class name (InnerClass.b) and its non-static members by creating an object of the inner class.
//
//3-Syntax: Notice the instantiation style: new OuterClass.InnerClass().
