import java.util.*;
class tailrecursion
{
    static void fun(int n)
    {
        if(n>0)
        {
            System.out.print(n+" ");
            fun(n-1);
        }
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        fun(n);
    }
}