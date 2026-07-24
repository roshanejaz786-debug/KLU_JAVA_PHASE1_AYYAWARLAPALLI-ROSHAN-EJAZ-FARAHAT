import java.util.*;
class base3and1
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int col,row;
        for(row=0;row<n;row++,System.out.println())
        {
            for(col=0;col<n-row-1;col++)
            System.out.print(" ");
            for(col=0;col<n;col++)
            System.out.print("*");
        }
    }
}