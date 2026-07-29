import java.util.*;
 
public class Main
{
    public static void main(String args[])
    {   int count=0;
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int n=arr[k-1];
        for(int i=0;i<a;i++){
        if(arr[i]>0 && arr[i]>=n)
        {
            count++;
        }
        }
        System.out.println(count);
    }
}