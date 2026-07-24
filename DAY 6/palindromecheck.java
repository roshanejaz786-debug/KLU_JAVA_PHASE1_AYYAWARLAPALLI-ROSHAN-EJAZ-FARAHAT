//Palindrome Check
import java.util.*;
class Main
{
	public static void main (String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int temp=n;
		int d,ans = 0;
		while(n!=0)
		{
			d=n%10;
			ans = ans*10+d;
			n=n/10;
		}
		if(temp==ans)
		System.out.print("Palindrome Number");
		else 
		System.out.print("Not a Palindrome Number");
	}
}