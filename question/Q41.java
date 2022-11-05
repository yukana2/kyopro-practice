import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc250/tasks/abc250_b">
 * AtCoder Beginner Contest 250 | B - Enlarged Checker Board
 * </a>
 */
public class Q41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        String[] lines = new String[a * n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < a; j++) {
                StringBuilder line = new StringBuilder();
                for (int k = 0; k < n; k++) {
                    String color = ((i + k) % 2 == 0) ? "." : "#";
                    line.append(color.repeat(b));
                }
                lines[a * i + j] = line.toString();
            }
        }

        for (int i = 0; i < n * a; i++) {
            System.out.println(lines[i]);
        }

    }
}