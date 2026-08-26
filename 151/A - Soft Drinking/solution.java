import java.util.*;
 
public class Main
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int p=sc.nextInt();
        int nl=sc.nextInt();
        int np=sc.nextInt();
        
        int sri=k*l;
        int one=sri/nl;
        int sec=c*d;
        int third=p/np;
        
        int min=Math.min(one,Math.min(sec,third));
        int ans=min/n;
        System.out.println(ans);
 
    }
}