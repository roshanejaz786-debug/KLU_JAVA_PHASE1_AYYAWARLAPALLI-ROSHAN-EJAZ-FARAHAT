import java.util.*;
class  nestedrecursion
{
    static int fun(int n)
    {
        if(n>100)
        return n-10;
        return fun(fun(n+11));
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ans = fun(n);
        System.out.print(ans);
    }
}