import java.util.*;
class unqelecount
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        int count = 0;
        int freq[] = new int[256];
        for(int i=0;i<st.length();i++)
        {
            char ch = st.charAt(i);
            freq[ch]++;
        }
        for(int i=0;i<256;i++)
        {
            if(freq[i]==1)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}