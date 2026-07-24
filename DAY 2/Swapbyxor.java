import java.util.*;
class Swapbyxor
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.print("Before swap : "+a+" "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.print(" After swap : "+a+" "+b);
    }
}