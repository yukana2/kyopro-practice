import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc264/tasks/abc262_a">
 * AtCoder Beginner Contest 262 | A - World Cup
 * </a>
 */
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        int r = y % 4;
        if (r == 2) {
            System.out.println(y);
            return;
        }

        if (r == 3) {
            System.out.println(y + 3);
            return;
        }

        if (r == 1) {
            System.out.println(y + 1);
            return;
        }

        if (r == 0) {
            System.out.println(y + 2);
            return;
        }
    }
}