import java.util.*;
class Zerosatleft
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int i,zc=0,oc=0;
        for(i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
            if((arr[i])==0)
            zc++;
        }
        for(i=0;i<zc;i++)
        arr[i]=0;
        for(i=zc;i<n;i++)
        arr[i]=1;
        for(i=0;i<n;i++)
        System.out.print(arr[i]+ " ");
    }
}