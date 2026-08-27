import java.util.*;
 
public class Main{
    
    public static void main(String args[])
    {
        Scanner sc= new  Scanner(System.in);
        int a=sc.nextInt();
        while(a-->0)
        {
            int b=sc.nextInt();
            
            int c=sc.nextInt();
            int div=b%c;
            int ans=(c-div)%c;
            System.out.println(ans);
            
            
        }
        
    }
    
}