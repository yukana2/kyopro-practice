import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc262/tasks/abc262_b">
 * AtCoder Beginner Contest 262 | B - Triangle
 * </a>
 */
public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());

        sc.nextLine();

        boolean[][] adj = new boolean[n][n];
        for (int i = 0; i < m; i++) {
            int u = Integer.parseInt(sc.next());
            int v = Integer.parseInt(sc.next());

            u -= 1;
            v -= 1;
            adj[u][v] = true;
            adj[v][u] = true;

            sc.nextLine();
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (adj[i][j] && adj[j][k] && adj[k][i]) {
                        result++;
                    }
                }
            }
        }

        System.out.println(result);
    }
}