import java.util.*;
 
public class Main
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        
        if(a%5==0)
        {   int ans=a/5;
            System.out.println(ans);
        }
        else
        {
            int ans=(a/5)+1;
            System.out.println(ans);
        }
    }
}