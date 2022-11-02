import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc257/tasks/abc257_b">
 * AtCoder Beginner Contest 257 | B - 1D Pawn
 * </a>
 */
public class Q34_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());

        sc.nextLine();

        int[] grid = new int[n];
        for (int i = 0; i < k; i++) {
            int a = Integer.parseInt(sc.next());
            grid[a - 1] = 1;
        }

        sc.nextLine();

        int[] l = new int[q];
        for (int i = 0; i < q; i++) {
            l[i] = Integer.parseInt(sc.next());
        }

        for (int i = 0; i < q; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (grid[j] == 1) {
                    cnt++;
                }
                if (cnt != l[i]) {
                    continue;
                }
                if (j == n - 1) {
                    continue;
                }
                if (grid[j + 1] == 0) {
                    grid[j] = 0;
                    grid[j + 1] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (grid[i] == 1) {
                System.out.print(i + 1 + " ");
            }
        }
    }
}