import java.util.*;
class Strongnumber
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp = n;
        int d,i,fact;
        int sum = 0;
        while(n!=0)
        {
            d = n%10;
            fact = 1;
            for(i=1;i<=d;i++)
            {
                fact*=i;
            }
            sum = sum+fact;
            n = n/10;
        }
        if(sum==temp)
        System.out.print("Strong Number");
        else
        System.out.print("Not a Strong Number");
    }
} 