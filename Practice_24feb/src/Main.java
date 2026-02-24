public class Main {
	public static void main(String[] args) 
	{
		loop1: for(int i=0; i<5; i++) 
		{
	        loop2: for(int j=0; j<3; j++) 
	        {
	            if(i==2)
	                break loop1;
	            System.out.println(i + " " + j);
	        }
	    }
	}
}
