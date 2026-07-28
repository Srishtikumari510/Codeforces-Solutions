import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        
        int count=0;
        for(int i=0;i<a;i++)
        {
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            
            int tot=b+c+d;
            
        
        if(tot>=2)
        {
            count++;
        }
        }
        System.out.println(count);
    }
}