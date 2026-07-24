//2+3+3+2 pattern
import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int col,row;
        for(row=0;row<n;row++)
        {
            for(col=0;col<=row;col++)
            System.out.print("*");
            for(col=0;col<n-row-1;col++)
            System.out.print(" ");
            for(col=0;col<n-row-1;col++)
            System.out.print(" ");
            for(col=0;col<=row;col++)
            System.out.print("*");
            System.out.println();
        }
    }
}