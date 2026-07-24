import java.util.*;
class Powerof2
{
    static int pow(int n)
    {
        while(n%2==0)
        n /= 2;
        return n;
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ans = pow(n);
        if(ans==1)
        System.out.print("Power of 2");
        else
        System.out.print("Not a Power of 2");
    }
}