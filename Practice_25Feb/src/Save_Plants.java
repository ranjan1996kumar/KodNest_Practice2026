//Save Plants
import java.util.*;
public class Save_Plants {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] plants = new int[n];

        for(int i = 0; i < n; i++) {
            plants[i] = sc.nextInt();
        }

        int count = 1;

        for(int i = 1; i < n; i++) {
            if(plants[i] > plants[i - 1]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
