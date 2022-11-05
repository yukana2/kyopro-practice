import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc248/tasks/abc248_b">
 * AtCoder Beginner Contest 248 | B - Slimes
 * </a>
 */
public class Q43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long k = Long.parseLong(sc.next());

        long slimes = a;
        int count = 0;
        while (slimes < b) {
            count++;
            slimes *= k;
        }

        System.out.println(count);
    }
}