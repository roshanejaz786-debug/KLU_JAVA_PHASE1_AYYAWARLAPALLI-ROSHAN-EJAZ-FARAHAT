import java.util.*;
class Togglestr
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        for(char c : st.toCharArray())
        {
            if(c>='A' && c<='Z')
            c=(char)(c+32);
            else if(c>='a' && c<='z')
            c=(char)(c-32);
            System.out.print(c);
        }
    }
}