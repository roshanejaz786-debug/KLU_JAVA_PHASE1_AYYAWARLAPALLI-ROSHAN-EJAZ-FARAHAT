import java.util.*;
class perfectsquare
{
    static void perfectsquare()
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 0;
        for(int i=1;i<=n/2;i++)
        {
            if(i*i==n)
            {
                System.out.print("Perfect Square");
                a = 1;
                break;
            }
        }
        if(a==0)
        System.out.print("Not a Perfect Square");
    }
    public static void main(String args[])
    {
        perfectsquare();
    }
}