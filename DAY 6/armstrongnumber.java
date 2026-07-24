import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp = n;
        int d,p,sum=0;
        int c = 0;
        while(n!=0)//Counting the digits
        {
            n = n/10;
            c++;
        }
        n=temp;
        while(n!=0)//Addition of powered values
        {
            d = n%10;
            p = (int)Math.pow(d,c);
            sum = sum+p;
            n/=10;
        }
        if(temp==sum)
        System.out.print("Armstrong Number");
        else
        System.out.print("Not an Armstrong Number");
    }
} 