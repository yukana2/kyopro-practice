import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc246/tasks/abc246_b">
 * AtCoder Beginner Contest 246 | B - Get Closer
 * </a>
 */
public class Q45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        double d = Math.sqrt(a * a + b * b);
        double x = a / d;
        double y = b / d;
        System.out.printf("%.10f" + " " + "%.10f", x, y);
    }
}