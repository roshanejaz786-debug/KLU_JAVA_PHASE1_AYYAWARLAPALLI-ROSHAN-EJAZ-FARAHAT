import java.util.*;
class sumofarray
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int i,sum=0;
        for(i=0;i<n;i++)
        {
        arr[i] = s.nextInt();
        sum = sum+arr[i];
        }
        System.out.print(sum);
    }
}