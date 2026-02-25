//Diamond of Stars
public class DiamondofStars {
	public static void main(String[] args) {
        int n = 5;

        // Upper part
        for(int i = 1; i <= n; i++) {

            for(int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            for(int star = 1; star <= i; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower part
        for(int i = n - 1; i >= 1; i--) {

            for(int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            for(int star = 1; star <= i; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
