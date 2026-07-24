//12345 pattern (logic col<row)
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int col;
        int row;
        for(row=0;row<n;row++,System.out.println())
            {
                for(col=0;col<row;col++)
                System.out.print("*");
            }
    }
}