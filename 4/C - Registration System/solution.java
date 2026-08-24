import java.util.*;
 
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
 
        HashMap<String, Integer> map = new HashMap<>();
 
        int a = sc.nextInt();
 
        while(a-- > 0)
        {
            String h = sc.next();
 
            int count = map.getOrDefault(h, 0);
 
            if(count == 0)
            {
                System.out.println("OK");
                map.put(h, 1);
            }
            else
            {
                System.out.println(h + count);
                map.put(h, count + 1);
            }
        }
    }
}