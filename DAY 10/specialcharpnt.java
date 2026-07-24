import java.util.*;
class specialcharpnt
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        int count = 0;
        for(char c : st.toCharArray())
        {
            if(!((c>='A' && c<='Z')||(c>='a' && c<='z')||(c>=0 && c<=9)))
            count++;
        }
        System.out.print(count);
    }
    
}