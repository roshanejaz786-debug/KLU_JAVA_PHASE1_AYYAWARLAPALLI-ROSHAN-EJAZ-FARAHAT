import java.util.*;
class revstr
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        String rev = " ";
        int i; 
        for(i=st.length()-1;i>=0;i--)
        rev += st.charAt(i);
        System.out.print(rev);
    }
}