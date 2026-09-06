import java.util.*;
 
public class Main {
    public static void main(String args[]) {
 
        Scanner sc = new Scanner(System.in);
 
        int a = sc.nextInt();
 
        HashMap<String, Integer> h1 = new HashMap<>();
 
        for (int i = 0; i < a; i++) {
 
            String name = sc.next();
 
            if (!h1.containsKey(name)) {
 
                System.out.println("OK");
                h1.put(name, 1);
 
            } else {
 
                int count = h1.get(name);
 
                String s = name + count;
 
                while (h1.containsKey(s)) {
                    count++;
                    s = name + count;
                }
 
                System.out.println(s);
 
                h1.put(s, 1);
                h1.put(name, count + 1);
            }
        }
 
        sc.close();
    }
}