/*Descending Digits: The Reverse Pyramid
Question: You need to develop a simple Java application to print a given pattern using nested loop structures.*/
public class Reverse_Pyramid {
	public static void main(String[] args) {
        for(int i = 5; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
