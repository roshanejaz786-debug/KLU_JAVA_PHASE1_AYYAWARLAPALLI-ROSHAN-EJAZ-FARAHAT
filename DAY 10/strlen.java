import java.util.*;
class strlen
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        int count=0;
        for(char c : st.toCharArray())
        count++;
        System.out.print(count);
    }
}