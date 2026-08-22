import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String tar="hello";
        int j=0;
        int n=s.length();
        int m=tar.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)==tar.charAt(j))
            {
                j++;
            }
            
            if(j==m)
            {
                break;
            }
        }
        if(j==m)
        {
            System.out.println("YES");
        }
        
        else
        {
            System.out.println("NO");
        }
        
        
        
    }
}