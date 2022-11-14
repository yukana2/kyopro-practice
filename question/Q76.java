import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc215/tasks/abc215_b">
 * AtCoder Beginner Contest 215 | B - log2(N)
 * </a>
 */
public class Q76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = Long.parseLong(sc.next());
        int k = 0;
        long val = 1;
        while (val <= n) {
            val *= 2;
            k++;
        }
        System.out.println(k - 1);
    }
}