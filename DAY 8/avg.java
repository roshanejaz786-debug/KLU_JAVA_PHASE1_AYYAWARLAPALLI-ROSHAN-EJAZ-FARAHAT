import java.util.*;
class avg
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int i,sum=0,c=0;
        for(i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
            if((arr[i]%3==0) && (arr[i]%2==0))
            {
            sum = sum+arr[i];
            c++;
            }
        }
        float avg = (float)(sum/c);
        System.out.printf("%.2f",avg);
    }
}