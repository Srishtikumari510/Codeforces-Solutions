import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int d = sc.nextInt();
        int sumTime = sc.nextInt();
 
        int[] min = new int[d];
        int[] max = new int[d];
 
        int minSum = 0;
        int maxSum = 0;
 
        for(int i = 0; i < d; i++) {
 
            min[i] = sc.nextInt();
            max[i] = sc.nextInt();
 
            minSum += min[i];
            maxSum += max[i];
        }
 
        if(sumTime < minSum || sumTime > maxSum) {
            System.out.println("NO");
            return;
        }
 
        System.out.println("YES");
 
        int[] schedule = new int[d];
 
        for(int i = 0; i < d; i++) {
            schedule[i] = min[i];
        }
 
        int extra = sumTime - minSum;
 
        for(int i = 0; i < d && extra > 0; i++) {
 
            int canAdd = max[i] - min[i];
 
            int add = Math.min(canAdd, extra);
 
            schedule[i] += add;
 
            extra -= add;
        }
 
        for(int i = 0; i < d; i++) {
            System.out.print(schedule[i] + " ");
        }
    }
}