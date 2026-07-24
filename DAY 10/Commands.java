import java.util.*;
public class Commands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.length());
        System.out.println(s.charAt(3));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.trim());
        System.out.println(s.substring(0, 5));
        System.out.println(s.equals("Meriduus"));
        System.out.println(s.equalsIgnoreCase("decimus"));
        System.out.println(s.contains("Srik"));
        System.out.println(s.replace('M','S'));
    }
}
