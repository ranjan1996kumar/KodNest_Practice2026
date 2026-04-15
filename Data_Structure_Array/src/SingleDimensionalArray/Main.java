package SingleDimensionalArray;

public class Main 
{
    public static void main(String[] args) 
    {
        // declaring an array, likely named 'marks'
        int[] marks = new int[5];
        
        // trying to access marks[5] here
        // Change the index to something between 0 and 4
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        marks[3] = 40;
        marks[4] = 50; 
        
        System.out.println(marks.length);
    }
}