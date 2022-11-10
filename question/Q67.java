import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc224/tasks/abc224_b">
 * AtCoder Beginner Contest 224 | B - Mongeness
 * </a>
 */
public class Q67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        long[][] aArr = new long[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                aArr[i][j] = Long.parseLong(sc.next());
            }
            sc.nextLine();
        }

        boolean enabled = true;
        for (int i1 = 0; i1 < h; i1++) {
            for (int i2 = i1 + 1; i2 < h; i2++) {
                for (int j1 = 0; j1 < w; j1++) {
                    for (int j2 = j1 + 1; j2 < w; j2++) {
                        if (aArr[i1][j1] + aArr[i2][j2] > aArr[i2][j1] + aArr[i1][j2]) {
                            enabled = false;
                            break;
                        }
                    }
                }
            }
        }

        if (enabled) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}