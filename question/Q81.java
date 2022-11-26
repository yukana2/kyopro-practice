import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc274/tasks/abc274_c">
 * AtCoder Beginner Contest 274 | C - Ameba
 * </a>
 */
public class Q81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        sc.nextLine();
        int[] aArr = new int[n];
        for (int i = 0; i < n; i++) {
            aArr[i] = Integer.parseInt(sc.next());
        }

        int[] results = new int[2 * n + 2];
        for (int i = 0; i < n; i++) {
            results[2 * (i + 1)] = results[aArr[i]] + 1;
            results[2 * (i + 1) + 1] = results[aArr[i]] + 1;
        }

        for (int i = 1; i <= 2 * n + 1; i++) {
            System.out.println(results[i]);
        }
    }
}