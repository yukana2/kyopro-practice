import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc254/tasks/abc254_a">
 * AtCoder Beginner Contest 254 | A - Last Two Digits
 * </a>
 */
public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        System.out.println(s.substring(s.length() - 2));
    }
}