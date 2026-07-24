import java.util.*;
class doublerev
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int d,e;
        int temp = n,ans=0,rev = 0;
        while(n!=0)
        {
            d =n%10;
            ans = ans*10+d;
            n /= 10;
        }
        while(ans!=0)
        {
            e = ans%10;
            rev = rev*10+e;
            ans = ans/10;
        }
        if(rev==temp)
        System.out.print("True");
        else
        System.out.print("False");
    }
}