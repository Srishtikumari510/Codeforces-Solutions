import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String s=sc.next();
        
        s=s.toLowerCase();
        
        if(a<26)
        {
            System.out.println("NO");
            return;
        }
        
          boolean seen[]=new boolean[26];
          for(int i=0;i<a;i++)
          {
              seen[s.charAt(i)-'a']=true;
          }
          for(int i=0;i<26;i++)
          {
              if(!seen[i])
              {
                  System.out.println("NO");
                  return;
              }
          }
          
          System.out.println("YES");
    }
}