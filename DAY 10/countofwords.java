import java.util.*;
class countofwords
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        int count=0;
        for(char c : st.toCharArray())
        {
            if(c==' ')
            {
                count++;
            }
        }
        System.out.println(count+1);
    }
}