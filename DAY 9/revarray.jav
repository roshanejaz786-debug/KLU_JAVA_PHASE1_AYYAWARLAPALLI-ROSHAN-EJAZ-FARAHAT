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
        int s=0;
        int e=n-1;
        while(s<e)
        {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        for(i=0;i<n;i++)
        System.out.print  (arr[i]+" ");
    }
}