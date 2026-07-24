//Number pattern 1n/23/n456/n78910....
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int col,row;
        int count = 1;
        for(row=0;row<n;row++)
        {
            for(col=0;col<=row;col++)
            System.out.print(count++);
            System.out.println();
        }
    }
}