import java.util.*;
class Main
{
    static void automorphic(int n)
    {
        int temp = n;
        int s = n*n;
        int c = 0;
        while(n!=0)
        {
            n = n/10;
            c++;
        }
        int val = (int)Math.pow(10,c);
        if(s%val==temp)
        System.out.print("Automorphic Number");
        else
        System.out.print("Not an Automorphic Number");
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        automorphic(n);
    }
}