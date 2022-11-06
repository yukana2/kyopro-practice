import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc234/tasks/abc234_b">
 * AtCoder Beginner Contest 234 | B - Longest Segment
 * </a>
 */
public class Q57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        sc.nextLine();

        int[] xn = new int[n];
        int[] yn = new int[n];
        for (int i = 0; i < n; i++) {
            xn[i] = Integer.parseInt(sc.next());
            yn[i] = Integer.parseInt(sc.next());
            sc.nextLine();
        }

        long max = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                long dx = xn[i] - xn[j];
                long dy = yn[i] - yn[j];
                long d2 = dx * dx + dy * dy;
                max = Math.max(max, d2);
            }
        }
        System.out.println(Math.sqrt(max));
    }
}