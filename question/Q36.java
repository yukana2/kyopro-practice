import java.util.*;

/**
 * <a href="https://atcoder.jp/contests/abc255/tasks/abc255_b">
 * AtCoder Beginner Contest 255 | B - Light It Up
 * </a>
 */
public class Q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());

        sc.nextLine();

        int[] a = new int[k];
        for (int i = 0; i < k; i++) {
            a[i] = Integer.parseInt(sc.next()) - 1;
        }

        sc.nextLine();

        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(sc.next());
            y[i] = Integer.parseInt(sc.next());
            sc.nextLine();
        }

        double result = 0;
        for (int i = 0; i < n; i++) {
            double dmin = Double.MAX_VALUE;
            for (int j = 0; j < k; j++) {
                int x1 = x[a[j]];
                int y1 = y[a[j]];
                int x2 = x[i];
                int y2 = y[i];
                double d = Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2);
                dmin = Math.min(d, dmin);
            }
            result = Math.max(result, dmin);
        }

        System.out.println(Math.sqrt(result));
    }
}