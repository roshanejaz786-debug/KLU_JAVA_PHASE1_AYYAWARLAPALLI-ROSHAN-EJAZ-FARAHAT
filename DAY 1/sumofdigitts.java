// Sum of the digits in the given number
import java.util.*;
class Main
{
	public static void main (String[] args)
	{
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		long d,sum=0;
		while(n!=0)
		{
			d=n%10;
			sum = sum+d;
			n=n/10;
		}
		System.out.print(sum);
	}
}