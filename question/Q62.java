import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc229/tasks/abc229_b">
 * AtCoder Beginner Contest 229 | B - Hard Calculation
 * </a>
 */
public class Q62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());

        boolean enable = false;
        while (a != 0 && b != 0) {
            long ra = a % 10;
            long rb = b % 10;
            if (ra + rb >= 10) {
                enable = true;
                break;
            }
            a /= 10;
            b /= 10;
        }

        if (enable) {
            System.out.println("Hard");
        } else {
            System.out.println("Easy");
        }

    }
}