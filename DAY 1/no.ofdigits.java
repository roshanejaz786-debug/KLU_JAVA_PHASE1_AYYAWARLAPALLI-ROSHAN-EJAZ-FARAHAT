//Number of digits present in the given number
import java.util.*;
class Main
{
	public static void main (String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int c = 0;
		while(n!=0)
		{
		    n=n/10;
		    c++;
		}
		System.out.println("No.of digits present in the given number : "+c);
	}
}