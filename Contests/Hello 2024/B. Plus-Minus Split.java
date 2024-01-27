import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; ++i) {
            int n = scanner.nextInt();
            int countPlus = 0, countMinus = 0;
            String s = scanner.next();
            for (int j = 0; j < n; ++j) {
                if (s.charAt(j) == '+') {
                    ++countPlus;
                } else {
                    ++countMinus;
                }
            }
            int ans = Math.abs(countPlus - countMinus);
            System.out.println(ans);
        }
        scanner.close();
    }
}
