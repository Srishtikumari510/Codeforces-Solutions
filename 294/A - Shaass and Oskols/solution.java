import java.util.*;
public class Main{
public static void main(String args[]){
    
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    
    int arr[]=new int[size];
    for(int i=0;i<size;i++)
    {
        arr[i]=sc.nextInt();
    }
    
    int shot=sc.nextInt();
    
    while(shot-- >0)
    {
        int wire=sc.nextInt()-1;
        int dead=sc.nextInt();
        
        if(wire>0)
        {
            arr[wire-1]=arr[wire-1]+(dead-1);
        }
        if(wire<size-1)
        {
       arr[wire + 1] += arr[wire] - dead; 
       }
        
        arr[wire]=0;
    }
    
    for(int i=0;i<size;i++)
    {
        System.out.println(arr[i]);
    }
}}