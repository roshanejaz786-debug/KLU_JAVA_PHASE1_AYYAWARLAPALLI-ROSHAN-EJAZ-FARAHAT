//base 2 and base 1 combination
import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int col,row;
        for(row=0;row<n;row++,System.out.println())
        {
            for(col=0;col<=row-1;col++)
            System.out.print(" ");
            for(col=0;col<n;col++)
            System.out.print("*");
        }
    }
}