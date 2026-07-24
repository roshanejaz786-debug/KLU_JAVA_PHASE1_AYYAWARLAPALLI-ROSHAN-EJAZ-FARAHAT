import java.util.*;
class multiplication
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int n = s.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.printf("%d * %d = %d\n" ,i,t,i*t);
        }
    }
}