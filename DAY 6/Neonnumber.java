import java.util.*;
class Neon
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int d,sum = 0;
        int sq_n = n*n;
        while(sq_n!=0)
        {
            d = sq_n%10;
            sum += d;
            sq_n/=10;
        }
        if(n==sum)
        System.out.print("Neon number");
        else
        System.out.print("Not a Neon number");
    }
}