public class M_Pattern {
	public static void main(String[] args) {

        int n = 11;   // You can change size (odd number preferred)

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {

                if(j == 0 || 
                   j == n-1 || 
                   (i == j && i <= n/2) || 
                   (i + j == n-1 && i <= n/2)) {

                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
