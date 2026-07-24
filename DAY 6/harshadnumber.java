import java.util.*;
class harshad
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int d,sum = 0;
        int temp = n;
        while(n!=0)
        {
            d = n%10;
            sum+=d;
            n/=10;
        }
        if(temp%sum==0)
        System.out.print("Harshad Number");
        else 
        System.out.print("Not a Harshad Number");
    }
}