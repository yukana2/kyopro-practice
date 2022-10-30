import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc275/tasks/abc275_a">
 * AtCoder Beginner Contest 275 | A - Find Takahashi
 * </a>
 */
public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int max = Integer.MIN_VALUE;
        int result = 0;
        for (int i = 0; i < n; i++) {
            int hi = Integer.parseInt(sc.next());
            if (max < hi) {
                max = hi;
                result = i;
            }
        }
        System.out.println(result + 1);
    }
}