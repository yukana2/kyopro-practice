import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc259/tasks/abc259_a">
 * AtCoder Beginner Contest 259 | A - Growth Record
 * </a>
 */
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int t = sc.nextInt();
        int d = sc.nextInt();

        if (m >= x) {
            System.out.println(t);
            return;
        }

        int tall = t  - (x - m) * d;
        System.out.println(tall);
    }
}