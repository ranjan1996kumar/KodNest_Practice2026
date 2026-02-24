/*Print Pattern 5 (Right-Angled Triangle - Numbers)
Question: You need to develop a simple Java application to print a given pattern using nested loop structures.*/

public class Print_pattern5 {
	public static void main(String[] args) {
        // Use nested for loops to print the given pattern
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
