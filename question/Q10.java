import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc264/tasks/abc261_a">
 * AtCoder Beginner Contest 261 | A - Intersection
 * </a>
 */
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        if (l2 >= l1 && l2 <= r1) {
            if (r2 >= r1) {
                System.out.println(r1 - l2);
                return;
            } else {
                System.out.println(r2 - l2);
                return;
            }
        }
        if (l2 <= l1 && r2 >= l1) {
            if (r2 <= r1) {
                System.out.println(r2 - l1);
                return;
            } else {
                System.out.println(r1 - l1);
                return;
            }
        }
        System.out.println(0);
    }
}