import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc274/tasks/abc274_a">
 * AtCoder Beginner Contest 274 | A - Batting Average
 * </a>
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double result = ((double)Math.round(b / a * 1000)) / 1000;
        System.out.printf("%.3f%n", result);
    }
}