import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int i;
        for(i=0;i<n;i++)
        arr[i] = s.nextInt();
        int ind = s.nextInt();
        int val = s.nextInt();
        arr[ind] = val;
        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
}