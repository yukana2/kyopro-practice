import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc233/tasks/abc233_b">
 * AtCoder Beginner Contest 233 | B - Longest Segment
 * </a>
 */
public class Q58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = Integer.parseInt(sc.next()) - 1;
        int r = Integer.parseInt(sc.next());
        sc.nextLine();
        String s = sc.next();
        String substring1 = s.substring(0, l);
        String substring2 = s.substring(l, r);
        String substring3 = s.substring(r);
        String reverse = new StringBuilder(substring2).reverse().toString();
        System.out.println(substring1 + reverse + substring3);
    }
}