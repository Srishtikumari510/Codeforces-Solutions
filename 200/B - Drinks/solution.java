import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        double sum=0;
        
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        
        double ave=sum/a;
        System.out.println(ave);
        
    }
}