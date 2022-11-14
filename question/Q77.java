import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc214/tasks/abc214_b">
 * AtCoder Beginner Contest 214 | B - How many?
 * </a>
 */
public class Q77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = Integer.parseInt(sc.next());
        int t = Integer.parseInt(sc.next());

        int cnt = 0;
        for (int a = 0; a <= 100; a++) {
            for (int b = 0; b <= 100; b++) {
                for (int c = 0; a + b + c <= s; c++) {
                    if (a * b * c <= t) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}