import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc253/tasks/abc253_a">
 * AtCoder Beginner Contest 253 | A - Median?
 * </a>
 */
public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());

        if ((b >= a && b <= c) || (b >= c && b <= a)) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}