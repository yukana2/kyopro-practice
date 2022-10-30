import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc275/tasks/abc275_b">
 * AtCoder Beginner Contest 275 | B - ABC-DEF
 * </a>
 */
public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long c = Long.parseLong(sc.next());
        long d = Long.parseLong(sc.next());
        long e = Long.parseLong(sc.next());
        long f = Long.parseLong(sc.next());

        long divisor = 998244353;

        long ra= a % divisor;
        long rb= b % divisor;
        long rc= c % divisor;
        long rd= d % divisor;
        long re= e % divisor;
        long rf= f % divisor;

        long x = (((ra * rb) % divisor) * rc) % divisor;
        long y = (((rd * re) % divisor) * rf) % divisor;
        long result = x - y;
        if (result < 0) {
            result += divisor;
        }
        System.out.println(result);
    }
}