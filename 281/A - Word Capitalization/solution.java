import java.util.*;
 
public class Main
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String a=sc.next();
        String ans=Character.toUpperCase(a.charAt(0))+a.substring(1);
        System.out.println(ans);
    }
}