import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc264/tasks/abc256_a">
 * AtCoder Beginner Contest 256 | A - 2^N
 * </a>
 */
public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((int)Math.pow(2, n));
    }
}