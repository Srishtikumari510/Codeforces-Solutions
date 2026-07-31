import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        int a = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
 
        int mid = a / 2;
        int s = mid + 1;
 
        if ((x == mid || x == s) && (y == mid || y == s)) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}