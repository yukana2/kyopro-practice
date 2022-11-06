import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc235/tasks/abc235_b">
 * AtCoder Beginner Contest 235 | B - Climbing Takahashi
 * </a>
 */
public class Q56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        sc.nextLine();

        long[] h = new long[n];
        for (int i = 0; i < n; i++) {
            h[i] = Long.parseLong(sc.next());
        }

        long now = h[0];
        for (int i = 0; i < n - 1; i++) {
            if (h[i + 1] > h[i]) {
                now = h[i + 1];
            } else {
                break;
            }
        }
        System.out.println(now);
    }
}