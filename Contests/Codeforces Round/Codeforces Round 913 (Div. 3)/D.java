import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            List<Pair<Integer, Integer>> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int first = scanner.nextInt();
                int second = scanner.nextInt();
                a.add(new Pair<>(first, second));
            }
            int low = 0, high = (int) 1e9;
            while (low < high) {
                int mid = (low + high) >> 1;
                if (ok(a, mid)) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }
            System.out.println(low);
        }
    }

    private static boolean ok(List<Pair<Integer, Integer>> a, int x) {
        int l = 0, r = 0;
        for (Pair<Integer, Integer> pair : a) {
            l = Math.max(l - x, pair.first);
            r = Math.min(r + x, pair.second);
            if (l > r) {
                return false;
            }
        }
        return true;
    }

    static class Pair<T, U> {
        T first;
        U second;

        Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }
    }
}
