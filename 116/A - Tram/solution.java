import java.util.*;
 
public class Main
{
    public static void main(String args[])
    {   Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cur=0;
        int max=0;
        
        
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            
            cur=cur-a+b;
            max=Math.max(max,cur);
            
        }
                    System.out.println(max);
 
    }
}