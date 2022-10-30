import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc269/tasks/abc269_b">
 * AtCoder Beginner Contest 269 | B - Rectangle Detection
 * </a>
 */
public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] chars = new char[10][10];
        for (int i = 0; i < 10; i++) {
            chars[i] = sc.nextLine().toCharArray();
        }

        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;
        int c = Integer.MAX_VALUE;
        int d = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (chars[i][j] == '#') {
                    a = Math.min(a, i + 1);
                    b = Math.max(b, i + 1);
                    c = Math.min(c, j + 1);
                    d = Math.max(d, j + 1);
                }
            }
        }

        System.out.println(a + " " + b + "\n" + c + " " + d);
    }
}