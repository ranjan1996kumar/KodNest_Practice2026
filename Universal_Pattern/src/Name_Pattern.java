//RANJAN
public class Name_Pattern {
	 public static void main(String[] args) {

	        int n = 7;

	        for (int i = 0; i < n; i++) {

	            for (int j = 0; j < n * 6; j++) {

	                int letter = j / n;   // which letter (0 to 5)
	                int col = j % n;      // column inside letter

	                // -------- R --------
	                if (letter == 0) {
	                    if (col == 0 ||
	                        (i == 0 && col < n-1) ||
	                        (i == n/2 && col < n-1) ||
	                        (col == n-1 && i > 0 && i < n/2) ||
	                        (i == col && i >= n/2))
	                        System.out.print("* ");
	                    else
	                        System.out.print("  ");
	                }

	                // -------- A --------
	                else if (letter == 1) {
	                    if ((col == 0 && i != 0) ||
	                        (col == n-1 && i != 0) ||
	                        i == 0 ||
	                        i == n/2)
	                        System.out.print("* ");
	                    else
	                        System.out.print("  ");
	                }

	                // -------- N --------
	                else if (letter == 2) {
	                    if (col == 0 || col == n-1 || i == col)
	                        System.out.print("* ");
	                    else
	                        System.out.print("  ");
	                }

	                // -------- J --------
	                else if (letter == 3) {
	                    if (i == 0 ||
	                        (col == n/2) ||
	                        (i == n-1 && col < n/2) ||
	                        (col == 0 && i > n/2))
	                        System.out.print("* ");
	                    else
	                        System.out.print("  ");
	                }

	                // -------- A --------
	                else if (letter == 4) {
	                    if ((col == 0 && i != 0) ||
	                        (col == n-1 && i != 0) ||
	                        i == 0 ||
	                        i == n/2)
	                        System.out.print("* ");
	                    else
	                        System.out.print("  ");
	                }

	                // -------- N --------
	                else if (letter == 5) {
	                    if (col == 0 || col == n-1 || i == col)
	                        System.out.print("* ");
	                    else
	                        System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	    }
}
