import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc222/tasks/abc222_b">
 * AtCoder Beginner Contest 222 | B - Failing Grade
 * </a>
 */
public class Q69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int p = Integer.parseInt(sc.next());
        sc.nextLine();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            if (a < p) {
                count++;
            }
        }
        System.out.println(count);
    }
}