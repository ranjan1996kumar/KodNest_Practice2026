package package1darray;
import java.util.Scanner;

public class Single_Dimentional_Array {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number of students");
	        int size = sc.nextInt();
	        int[] marks = new int[size];
	        System.out.println("Array created");

	        for (int i = 0; i < marks.length; i++) {
	            System.out.println("Enter the marks of student " + (i + 1));
	            marks[i] = sc.nextInt();
	        }

	        System.out.println("Marks of students are");
	        for (int i = 0; i < marks.length; i++) {
	            System.out.print(marks[i] + " ");
	        }
	    }
}
