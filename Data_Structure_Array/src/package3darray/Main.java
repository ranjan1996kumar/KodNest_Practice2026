package package3darray;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of college");
        int coll = sc.nextInt();

        int[][][] marks = new int[coll][][];

        for(int i=0; i<marks.length; i++) {
            System.out.println("Enter the number of classes in college " + (i+1));
            int cls = sc.nextInt();
            marks[i] = new int[cls][];
        }

        for(int i=0; i<marks.length; i++) {
            for(int j=0; j<marks[i].length; j++) {
                System.out.println("Enter the number of students in class " + (j+1) + " of college " + (i+1));
                int s = sc.nextInt();
                marks[i][j] = new int[s];
            }
        }
    }
}
