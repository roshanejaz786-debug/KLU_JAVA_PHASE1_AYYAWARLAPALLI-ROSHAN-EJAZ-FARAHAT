//Base 3 pattern 54321 pattern
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
            for(col=0;col<n-row;col++)
            System.out.print("*");
            System.out.println();
        }
    }
}