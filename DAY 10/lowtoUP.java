import java.util.*;
class lowtoUP
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        for(char c : st.toCharArray())
        {
            c=(char)(c-32);
            System.out.print(c);
        }
    }
}