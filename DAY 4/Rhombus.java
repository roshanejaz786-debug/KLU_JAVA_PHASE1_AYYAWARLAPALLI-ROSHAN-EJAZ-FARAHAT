//rhombus within star
import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int col,row;
        for(row=0;row<n-1;row++)
        {
            for(col=0;col<n-row;col++)//3
            System.out.print("*");
            for(col=0;col<=row-1;col++)//2
            System.out.print(" ");
            for(col=0;col<=row-1;col++)//2
            System.out.print(" ");
            for(col=0;col<n-row;col++)//3
            System.out.print("*");
            System.out.println();
        }
        for(row=0;row<n;row++)
        {
            for(col=0;col<=row;col++)//2
            System.out.print("*");
            for(col=0;col<n-row-1;col++)//3
            System.out.print(" ");
            for(col=0;col<n-row-1;col++)//3
            System.out.print(" ");
            for(col=0;col<=row;col++)//2
            System.out.print("*");
            System.out.println();
        }
    }
}