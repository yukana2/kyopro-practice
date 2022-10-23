import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc265/tasks/abc265_a">
 * AtCoder Beginner Contest 265 | A - Apple
 * </a>
 */
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();
        if (x * 3 <= y) {
            System.out.println(x * n);
            return;
        }

        int xc = n % 3;
        int yc = n / 3;
        System.out.println(x * xc + y * yc);
    }
}