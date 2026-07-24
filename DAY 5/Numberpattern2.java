//Number Pattern
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int col;
        int row;
        for(row=0;row<n;row++)
        {
        for(col=0;col<n;col++)
        System.out.print(row+1);
        System.out.println();
        }
    }
}