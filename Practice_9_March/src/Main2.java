
public class Main2 {

	    static {
	        System.out.println("Static Block 1: Starting program setup...");
	    }

	    static {
	        System.out.println("Static Block 2: Loading configuration...");
	    }

	    {
	        System.out.println("Instance Block 1: Preparing object...");
	    }

	    {
	        System.out.println("Instance Block 2: Assigning default values...");
	    }

	    public static void main(String[] args) {

	        System.out.println("Main Method: Program started.");

	        Main obj1 = new Main();

	        System.out.println("----------------------");

	        Main obj2 = new Main();
	    }
}
