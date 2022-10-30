import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc251/tasks/abc251_a">
 * AtCoder Beginner Contest 251 | A -Six Characters
 * </a>
 */
public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.repeat(6 / s.length()));
    }
}