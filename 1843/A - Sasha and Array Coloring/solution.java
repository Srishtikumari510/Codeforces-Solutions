import java.util.*;
 
public class Main
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        while(a-->0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            { 
                arr[i]=sc.nextInt();
              
            }
           
            
        
        int colour=n/2;
        int ans=0;
        Arrays.sort(arr);
        for(int i=0;i<colour;i++)
        {
            ans+=arr[n-i-1]-arr[i];
            
            
            
        }
        System.out.println(ans);
         
        
    }
}}