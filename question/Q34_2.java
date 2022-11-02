import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc257/tasks/abc257_b">
 * AtCoder Beginner Contest 257 | B - 1D Pawn
 * </a>
 */
public class Q34_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());

        sc.nextLine();

        int[] grid = new int[k + 2];
        for (int i = 1; i <= k; i++) {
            grid[i] = Integer.parseInt(sc.next());
        }
        grid[k + 1] = n + 1;

        sc.nextLine();

        for (int i = 0; i < q; i++) {
            int l = Integer.parseInt(sc.next());
            if (grid[l] + 1 < grid[l + 1]) {
                grid[l]++;
            }
        }

        for (int i = 1; i <= k; i++) {
            System.out.print(grid[i] + " ");
        }
    }
}