import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc250/tasks/abc250_a">
 * AtCoder Beginner Contest 250 | A -Adjacent Squares
 * </a>
 */
public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        sc.nextLine();
        int r = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());

        int count = 0;
        if ((r == 1 || r == h) && h > 1) {
            count += 1;
        }

        if (r > 1 && r < h) {
            count += 2;
        }

        if ((c == 1 || c == w) && w > 1) {
            count += 1;
        }

        if (c > 1 && c < w) {
            count += 2;
        }

        System.out.println(count);
    }
}