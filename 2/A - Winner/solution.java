import java.util.*;
 
public class Main {
    public static void main(String args[]) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        String[] name = new String[n];
        int[] score = new int[n];
 
        HashMap<String, Integer> h1 = new HashMap<>();
 
        for (int i = 0; i < n; i++) {
 
            name[i] = sc.next();
            score[i] = sc.nextInt();
 
            h1.put(
                name[i],
                h1.getOrDefault(name[i], 0) + score[i]
            );
        }
 
        int max = Integer.MIN_VALUE;
 
        for (int x : h1.values()) {
            if (x > max) {
                max = x;
            }
        }
 
        HashMap<String, Integer> current = new HashMap<>();
 
        for (int i = 0; i < n; i++) {
 
            current.put(
                name[i],
                current.getOrDefault(name[i], 0) + score[i]
            );
 
            if (current.get(name[i]) >= max &&
                h1.get(name[i]) == max) {
 
                System.out.println(name[i]);
                break;
            }
        }
    }
}