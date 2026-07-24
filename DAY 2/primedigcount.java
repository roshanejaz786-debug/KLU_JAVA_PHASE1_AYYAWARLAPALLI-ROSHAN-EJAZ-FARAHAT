//Prime digit count
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int d,c=0;
        while(n!=0)
        {
            d=n%10;
            if(d==2||d==3||d==5||d==7)
            c++;
            n=n/10;
        }
        System.out.print(c+" ");
    }
}