import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            String s = scanner.nextLine();
            Stack<Character> typed = new Stack<>();

            for (char c : s.toCharArray()) {
                if (c == 'b' && !typed.isEmpty() && Character.isLowerCase(typed.peek())) {
                    typed.pop();
                } else if (c == 'B' && !typed.isEmpty() && Character.isUpperCase(typed.peek())) {
                    typed.pop();
                } else if (c != 'b' && c != 'B') {
                    typed.push(c);
                }
            }

            StringBuilder result = new StringBuilder();
            for (char c : typed) {
                result.append(c);
            }

            System.out.println(result.toString());
        }

        scanner.close();
    }
}
