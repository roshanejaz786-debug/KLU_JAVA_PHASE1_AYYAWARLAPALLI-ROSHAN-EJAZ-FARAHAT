//Hallow Square Pattern
import java.util.*;
class Main
{
	public static void main (String[] args)
	{
	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    int row,col;
	    for(row=0;row<n;row++)
	    {
	        for(col=0;col<n;col++)
	        {
	            if(row==0||row==n-1||col==0||col==n-1)
	            System.out.print("*");
	            else
	            System.out.print(" ");
	        }
	        System.out.println();
	    }
	}
}
