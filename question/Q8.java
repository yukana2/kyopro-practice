import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc264/tasks/abc264_a">
 * AtCoder Beginner Contest 264 | A - "atcoder".substr()
 * </a>
 */
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("atcoder".substring(l - 1, r));
    }
}