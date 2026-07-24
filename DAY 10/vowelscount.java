import java.util.*;
class vowelscount
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        int count = 0; 
        for(char c : st.toCharArray())
        {
            if((c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u'))
            count++;
        }
        System.out.print(count);
    }
}