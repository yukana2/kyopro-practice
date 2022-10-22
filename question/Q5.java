import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc271/tasks/abc271_a">
 * AtCoder Beginner Contest 271 | A - 484558
 * </a>
 */
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String hex = Integer.toHexString(n).toUpperCase();
        if (hex.length() == 1) {
            hex = "0" + hex;
        }
        System.out.println(hex);
    }
}