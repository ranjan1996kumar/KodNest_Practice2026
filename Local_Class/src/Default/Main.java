package Default;

class OuterClass {
    int a = 10;
    static int b = 20;

    void outerDisplay() {
        System.out.println("Outer class display method");
        System.out.println(a);
        System.out.println(b);

        class InnerClass {
            int c = 30;
            static int d = 40;

            void innerDisplay() {
                System.out.println("Inner class display method");
                System.out.println(c);
                System.out.println(d);
                System.out.println(a);
                System.out.println(b);
            }
        }

        System.out.println(InnerClass.d);
        InnerClass ic = new InnerClass();
        System.out.println(ic.c);
        ic.innerDisplay();
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        oc.outerDisplay();
    }
}


//Scope: The InnerClass is defined inside the outerDisplay() method, making it a Local Inner Class. It can only be instantiated and used within that specific method.
//
//Access: The local inner class has access to both instance variables (a) and static variables (b) of the outer class.
//
//Static Members: In modern Java versions (like the one shown in your session), local inner classes can have static fields like static int d = 40.
