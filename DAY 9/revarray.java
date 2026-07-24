import java.util.*;
class revarray
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i;
        int arr[] = new int[n];
        for(i=0;i<n;i++)
        arr[i] = s.nextInt();
        for(i=n-1;i>=0;i--)
        System.out.print(arr[i]+" ");
    }
}