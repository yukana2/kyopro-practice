import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc236/tasks/abc236_b">
 * AtCoder Beginner Contest 236 | B - Who is missing?
 * </a>
 */
public class Q55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        sc.nextLine();

        int[] counts = new int[n + 1];
        for (int i = 0; i < 4 * n - 1; i++) {
            int a = Integer.parseInt(sc.next());
            counts[a]++;
        }

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == 3) {
                System.out.println(i);
            }
        }

    }
}