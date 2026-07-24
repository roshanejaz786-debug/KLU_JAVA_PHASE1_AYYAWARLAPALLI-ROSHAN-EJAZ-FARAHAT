import java.util.*;
class Swap
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int i;
        for(i=0;i<n;i++)
        arr[i] = s.nextInt();
        for(i=0;i<n-1;i+=2)
        {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for(i=0;i<n;i++)
        System.out.print(arr[i]+ " ");
    }
}