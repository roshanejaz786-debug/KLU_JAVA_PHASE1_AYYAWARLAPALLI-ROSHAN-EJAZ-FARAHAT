import java.util.*;
class count
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int i,OC=0,EC=0;
        for(i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
            if(arr[i]%2==0)
            EC++;
            else
            OC++;
        }
        System.out.println("Odd Elements " + OC);
        System.out.println("Even Elements " + EC);
    }
}