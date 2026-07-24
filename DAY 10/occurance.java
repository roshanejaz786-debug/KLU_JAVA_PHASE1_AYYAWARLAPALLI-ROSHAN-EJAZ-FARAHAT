import java.util.*;
class occurance
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        int freq[] = new int[256];
        for(int i=0;i<st.length();i++)
        {
            char ch = st.charAt(i);
            freq[ch]++;
        }
        for(int i=0;i<256;i++)
        {
            char ch = st.charAt(i);
            System.out.println(ch+"-"+freq[ch]);
        }
    }
}