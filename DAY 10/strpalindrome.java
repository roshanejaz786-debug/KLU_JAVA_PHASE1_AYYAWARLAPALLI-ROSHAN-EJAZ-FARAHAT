import java.util.*;
class strpalindrome
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        String rev = "";
        for (int i = st.length() - 1; i >= 0; i--)
        {
            rev = rev + st.charAt(i);
        }
        if (st.equals(rev))
        {
            System.out.println("The string is a palindrome.");
        }
        else
        {
            System.out.println("The string is not a palindrome.");
        }
    }
}