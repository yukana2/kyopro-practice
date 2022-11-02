import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc256/tasks/abc256_b">
 * AtCoder Beginner Contest 256 | B - Batters
 * </a>
 */
public class Q35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        sc.nextLine();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        int p = 0;
        boolean[] field = new boolean[4];
        for (int i = 0; i < n; i++) {
            boolean[] tmp = new boolean[4];
            field[0] = true;
            for (int j = 0; j < 4; j++) {
                if (!field[j]) {
                    continue;
                }
                if (j + a[i] < 4) {
                    tmp[j + a[i]] = true;
                } else {
                    p++;
                }
            }
            System.arraycopy(tmp, 0, field, 0, 4);
        }
        System.out.println(p);
    }
}