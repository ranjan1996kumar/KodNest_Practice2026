/*Print Pattern 7 (Grid of Numbers)
Question: You need to develop a simple Java application to print a given pattern using nested loop structures.*/
public class Print_pattern7 {
	public static void main(String[] args) {
        for(int i = 1; i <= 3; i++) //outer loop -> 3 rows
        {
            for(int j = 1; j <= 4; j++) //inner loop -> 1 to 4 columns
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
