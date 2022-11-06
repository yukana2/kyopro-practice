import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc228/tasks/abc228_b">
 * AtCoder Beginner Contest 228 | B - Takahashi's Secret
 * </a>
 */
public class Q63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next()) - 1;
        sc.nextLine();
        int[] an = new int[n];
        for (int i = 0; i < n; i++) {
            an[i] = Integer.parseInt(sc.next()) - 1;
        }

        boolean[] know = new boolean[n];
        int count = 0;
        while (!know[x]) {
            know[x] = true;
            x = an[x];
            count++;
        }

        System.out.println(count);
    }
}