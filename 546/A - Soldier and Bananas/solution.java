import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int add=0;
        for(int i=1;i<=c;i++){
            int mul=i*a;
            add=add+mul;
        }
        
        if(add<=b)
        {
            System.out.println("0");
        }
        else
        {
        System.out.println(add-b);
        }
        
    }
}