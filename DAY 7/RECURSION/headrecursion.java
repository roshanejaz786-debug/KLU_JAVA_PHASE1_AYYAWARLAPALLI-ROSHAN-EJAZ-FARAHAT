import java.util.*;
class headrecursion
{
    static void fun(int n)
    {
        if(n>0)
        {
            fun(n-1);
            System.out.print(n+" ");
            System.out.println(n+1+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        fun(n);
    }
}