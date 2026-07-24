import java.util.*;
class perfectnumber
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i;
        int sum = 0;
        for(i=1;i<=n/2;i++)
        {
            if(n%i==0)
            sum = sum+i;
        }
        if(sum==n)
        System.out.print("Perfect Number");
        else
        System.out.print("Not a Perfect Number");
    }
} 