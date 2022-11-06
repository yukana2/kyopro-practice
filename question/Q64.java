import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc227/tasks/abc227_b">
 * AtCoder Beginner Contest 227 | B - KEYENCE building
 * </a>
 */
public class Q64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        sc.nextLine();
        int[] sn = new int[n];
        for (int i = 0; i < n; i++) {
            sn[i] = Integer.parseInt(sc.next());
        }

        int failure = 0;
        for (int i = 0; i < n; i++) {
            int s = sn[i];
            boolean enable = false;
            for (int a = 1; a < 1000; a++) {
                for (int b = 1; b < 1000; b++) {
                    int tmp = 4 * a * b + 3 * a + 3 * b;
                    if (s == tmp) {
                        enable = true;
                        break;
                    }
                }
                if (enable) {
                    break;
                }
            }
            if (!enable) {
                failure++;
            }
        }
        System.out.println(failure);
    }
}