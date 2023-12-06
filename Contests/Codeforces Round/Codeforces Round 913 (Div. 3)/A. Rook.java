import java.util.Scanner;

public class Solution {

    public static String[] rookMoves(String position) {
        char column = position.charAt(0);
        int row = Character.getNumericValue(position.charAt(1));

        String[] moves = new String[14];
        int index = 0;

        for (int i = 1; i <= 8; i++) {
            if (i != row) {
                moves[index++] = String.valueOf(column) + i;
            }
        }

        for (char i = 'a'; i <= 'h'; i++) {
            if (i != column) {
                moves[index++] = String.valueOf(i) + row;
            }
        }

        return moves;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String position = sc.next();

            String[] moves = rookMoves(position);

            for (String move : moves) {
                if (move != null) {
                    System.out.println(move);
                }
            }
        }
    }
}
