import java.util.*;
 
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
 
        int a = sc.nextInt();
 
        int p = sc.nextInt();
 
        boolean level[] = new boolean[a + 1];
 
        // X's levels
        for(int i = 0; i < p; i++)
        {
            int x = sc.nextInt();
            level[x] = true;
        }
 
        int s = sc.nextInt();
 
        // Y's levels
        for(int i = 0; i < s; i++)
        {
            int x = sc.nextInt();
            level[x] = true;
        }
 
        boolean found = true;
 
        for(int i = 1; i <= a; i++)
        {
            if(!level[i])
            {
                found = false;
                break;
            }
        }
 
        if(found)
        {
            System.out.println("I become the guy.");
        }
        else
        {
            System.out.println("Oh, my keyboard!");
        }
    }
}