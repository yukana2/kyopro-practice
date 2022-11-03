import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc252/tasks/abc252_b">
 * AtCoder Beginner Contest 252 | B - Takahashi's Failure
 * </a>
 */
public class Q39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        sc.nextLine();

        int[] a = new int[n];
        int max = -1;
        for (int i = 0; i < n; i++) {
            int delicious = Integer.parseInt(sc.next());
            if (delicious >= max) {
                max = delicious;
            }
            a[i] = delicious;
        }
        sc.nextLine();

        for (int i = 0; i < k; i++) {
            int b = Integer.parseInt(sc.next());
            if (a[b - 1] == max) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}