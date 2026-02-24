/*Print Pattern 9 (Right-Aligned Triangle - Stars)
Question: You need to develop a simple Java application to print a given pattern using nested loop structures.*/
public class Print_pattern9 {
	public static void main(String[] args) {
        // Use nested for loops to print the given pattern
        for (int i = 1; i <= 5; i++) {
            // Print spaces
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
