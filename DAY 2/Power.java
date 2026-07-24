import java.util.*;
class Power
{
    static void pow()
    {
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        int p = s.nextInt();
        int ans=1;
        while(p!=0)
        {
            ans = ans * b;
            p--;
        }
        System.out.print(ans);
    }
    public static void main(String args[])
    {
        pow();
    }
}