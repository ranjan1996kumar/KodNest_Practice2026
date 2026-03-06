class Program {
    static int a;

    static
    {
        System.out.println("In the static block");
        a = 10;
    }

    static void display1() {
        System.out.println("In the static method");
        System.out.println(a);
    }

    int b;

    {
        System.out.println("In the non static block");
        b = 20;
    }

    void display2() {
        System.out.println("In the non static method");
        System.out.println(b);
    }

    public static void main(String[] args)
    {
        Program.display1();
        Program p = new Program();
        p.display2();
    }
}