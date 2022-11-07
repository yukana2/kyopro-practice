import java.util.*;

/**
 * <a href="https://atcoder.jp/contests/abc225/tasks/abc225_b">
 * AtCoder Beginner Contest 225 | B - Star or Not
 * </a>
 */
public class Q66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int[] counts = new int[n];
        for (int i = 0; i < n - 1; i++) {
            int a = Integer.parseInt(sc.next()) - 1;
            int b = Integer.parseInt(sc.next()) - 1;
            counts[a] ++;
            counts[b] ++;
            sc.nextLine();
        }

        for (int count : counts) {
            if (count == n - 1) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}