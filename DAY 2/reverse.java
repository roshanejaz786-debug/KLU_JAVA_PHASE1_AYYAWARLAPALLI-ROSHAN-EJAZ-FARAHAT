//Reversing the given number
import java.util.*;
class Main
{
	public static void main (String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int d;
		while(n!=0)
		{
			d=n%10;
			System.out.print(d);
			n=n/10;
		}
	}
}