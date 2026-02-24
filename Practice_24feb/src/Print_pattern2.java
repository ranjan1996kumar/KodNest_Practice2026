//Java application to print a given pattern using nested loop structures.
public class Print_pattern2 {
	public static void main(String[] args) {
        // Use nested for loops to print the given pattern
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
