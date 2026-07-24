import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int fact = 1;
        int i;
        for(i=1;i<=n;i++)
        {
            fact = fact * i;
        }
        System.out.print(fact);
    }
}