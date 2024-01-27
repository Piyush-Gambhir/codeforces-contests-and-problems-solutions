import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                } else {
                    map.put(ch, 1);
                }
            }
            int count = 0;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getKey() - 'A' + 1 <= entry.getValue()) {
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
