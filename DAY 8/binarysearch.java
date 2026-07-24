import java.util.*;
class binarysearch
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int i,low=0,high=n-1;
        int flag=0;
        for(i=0;i<n;i++)
        arr[i] = s.nextInt();
        int t = s.nextInt();
        while(low<high)
        {
            int mid = (low+high)/2;
            if(mid==t)
            {
                flag=1;
                System.out.println("Present");
                break;
            }
            else if(mid<t)
            low=mid+1;
            else
            low=mid-1;
        }
        if(flag==0)
        System.out.print("Not Present");
    }
}