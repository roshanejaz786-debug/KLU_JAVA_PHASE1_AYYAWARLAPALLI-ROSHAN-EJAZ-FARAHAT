import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int i,sum1=0,sum2=0;
        for(i=1;i<=n1/2;i++)
        {
            if(n1%i==0)
            sum1 += i;
        }
        for(i=1;i<=n2/2;i++)
        {
            if(n2%i==0)
            sum2 += i;
        }
        if(n1==sum2 && n2==sum1)
        System.out.print("Ambicable Pair");
        else
        System.out.print("Not an Ambicable Pair");
    }
}