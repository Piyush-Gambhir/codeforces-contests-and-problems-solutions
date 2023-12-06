import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            scanner.nextLine();
            String s = scanner.nextLine();

            HashMap<Character, Integer> d = new HashMap<>();
            for (char c : s.toCharArray()) {
                d.put(c, d.getOrDefault(c, 0) + 1);
            }

            PriorityQueue<Integer> a = new PriorityQueue<>();
            for (int count : d.values()) {
                a.offer(-count);
            }

            while (a.size() > 1) {
                int q1 = Math.abs(a.poll());
                int q2 = Math.abs(a.poll());
                q1 -= 1;
                q2 -= 1;

                if (q1 > 0) {
                    a.offer(-q1);
                }
                if (q2 > 0) {
                    a.offer(-q2);
                }
            }

            int ans = 0;
            for (int count : a) {
                ans += Math.abs(count);
            }

            System.out.println(ans);
        }

        scanner.close();
    }
}
