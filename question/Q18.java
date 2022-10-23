import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc274/tasks/abc273_b">
 * AtCoder Beginner Contest 273 | B - Broken Rounding
 * </a>
 */
public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int k = sc.nextInt();

        double result = x;
        for (int i = 0; i < k; i++) {
            result = Math.round(result / Math.pow(10, i + 1)) * Math.pow(10, i + 1);
        }
        System.out.println((long)result);
    }
}