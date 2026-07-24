import java.util.*;
class check
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i,flag=0;
        int arr[] = new int[n];
        for(i=0;i<n;i++)
        arr[i] = s.nextInt();
        int se = s.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]==se)
            {

                System.out.print("Present");
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.print("Not present");
    }
}