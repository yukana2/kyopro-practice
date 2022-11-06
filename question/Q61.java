import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc230/tasks/abc230_b">
 * AtCoder Beginner Contest 230 | B - Triple Metre
 * </a>
 */
public class Q61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = "oxx".repeat((int)Math.pow(10, 5));
        if (t.contains(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}