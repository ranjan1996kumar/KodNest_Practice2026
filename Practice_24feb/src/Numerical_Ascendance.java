/*Pattern Printing - Numerical Ascendance
Question Title: Pattern Printing - Right Triangle Pattern with Numbers.
Question Description: Write a Java program to print a right triangle pattern where each row i contains numbers from 1 to i.*/
public class Numerical_Ascendance {
	public static void main(String[] args) {
        // Write your code here
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
