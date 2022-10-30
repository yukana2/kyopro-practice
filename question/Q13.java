import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc257/tasks/abc257_a">
 * AtCoder Beginner Contest 257 | A - A to Z String 2
 * </a>
 */
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        StringBuilder s = new StringBuilder();
        for (char c = 'A'; c <= 'Z'; c++) {
            s.append(String.valueOf(c).repeat(n));
        }
        System.out.println(s.toString().charAt(x - 1));
    }
}