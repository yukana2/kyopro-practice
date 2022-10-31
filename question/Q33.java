import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc258/tasks/abc258_b">
 * AtCoder Beginner Contest 258 | B - Number Box
 * </a>
 */
public class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());

        sc.nextLine();

        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            char[] chars = sc.next().toCharArray();
            for (int j = 0; j < n; j++) {
                a[i][j] = chars[j] - '0';
            }
            sc.nextLine();
        }

        long max = Long.MIN_VALUE;
        int[] p = {1, 1, 1, 0, 0, -1, -1, -1};
        int[] q = {1, 0, -1, 1, -1, 1, 0, -1};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 8; k++) {
                    long tmp = 0;
                    int x = i;
                    int y = j;
                    for (int l = 0; l < n; l++) {
                        tmp *= 10;
                        tmp += a[x][y];
                        x += p[k];
                        y += q[k];
                        x %= n;
                        x += n;
                        x %= n;
                        y %= n;
                        y += n;
                        y %= n;
                    }
                    max = Math.max(max, tmp);
                }
            }
        }
        System.out.println(max);
    }
}