import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int d,e;
        int ans=0;
        int sq_n = n*n;
        while(n!=0)
        {
            d = n%10;
            ans = ans*10+d;
            n /= 10; 
        }
        int rev_n = ans;
        int sq_rev_n = ans*ans;
        int rev_ans=0;
        while(sq_rev_n!=0)
        {
            e = sq_rev_n%10;
            rev_ans = rev_ans*10+e;
            sq_rev_n /= 10;
        }
        if(sq_n ==  rev_ans)
        System.out.print("Adam Number");
        else
        System.out.print("Not an Adam Number");
    }
}