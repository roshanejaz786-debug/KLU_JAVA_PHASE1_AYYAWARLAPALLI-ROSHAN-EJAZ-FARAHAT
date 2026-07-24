//1 0 1 0 1 Pattern
import java.util.*;
class Main
{
	public static void main (String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row,col;
		for(row=0; row<n; row++)
		{
			for(col=0; col<n; col++)
			{
				if((row+col)%2==0)
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println();
		}
	}
}
