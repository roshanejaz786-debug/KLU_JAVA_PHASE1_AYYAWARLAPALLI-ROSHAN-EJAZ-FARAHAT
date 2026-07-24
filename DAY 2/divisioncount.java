import java.util.*;
class divisioncount
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int c=0;
        int ans;
        while(n!=0)
        {
            if(n%2==0)
            {
            n/=2;
            c++;
            }
            else
            {
            n=n-1;
            c++;
            }
        }
        System.out.print(c);
    }

}