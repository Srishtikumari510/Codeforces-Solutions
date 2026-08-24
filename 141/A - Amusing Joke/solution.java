import java.util.*;
 
public class Main
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        
        HashMap<Character,Integer>map=new HashMap<>();
         
        String a=sc.next();
        int a1=a.length();
        String b=sc.next();
        int b1=b.length();
        String c=sc.next();
        int c1=c.length();
        
        if(a1+b1!=c1)
        {
            System.out.println("NO");
            return;
        }
        
        for(int i=0;i<a1;i++)
        {
          char ch=a.charAt(i);
          map.put(ch,map.getOrDefault(ch,0)+1);
          
        }
        
        for(int j=0;j<b1;j++)
        {
            char ch=b.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        
        for(int i=0;i<c1;i++)
        {
            char ch=c.charAt(i);
            
            if(!map.containsKey(ch))
            {
                            System.out.println("NO");
                            return;
 
            }
            map.put(ch,map.getOrDefault(ch,0)-1);
            
            if(map.get(ch)<0)
            {
                System.out.println("NO");
                return;
            }
        }
        
        
        
        System.out.println("YES");
        
        
        
    }
}