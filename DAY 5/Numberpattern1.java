//Number Pattern 1/n22/n333/n4444/n55555
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
            System.out.print(row+1);
            System.out.println();
        }
    }
}