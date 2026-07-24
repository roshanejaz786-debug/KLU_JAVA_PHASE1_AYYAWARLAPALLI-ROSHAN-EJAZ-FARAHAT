import java.util.*;
class specificdigit
{
    static int occurance()
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int dig = s.nextInt();
        int c=0,d;
        while(n!=0)
        {
            d=n%10;
            if(d==dig)
            c++;
            n=n/10;
        }
        return c;
    }
    public static void main(String args[])
    {
        int ans = occurance();
        System.out.print(ans);
    }
}