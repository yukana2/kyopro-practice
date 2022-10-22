import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc273/tasks/abc273_a">
 * AtCoder Beginner Contest 273 | A - A Recursive Function
 * </a>
 */
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] fn = new int[n+1];
        fn[0] = 1;
        for (int i = 1; i <= n; i++) {
            fn[i] = fn[i - 1] * i;
        }
        System.out.println(fn[n]);
    }
}