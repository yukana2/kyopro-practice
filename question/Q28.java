import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc265/tasks/abc265_b">
 * AtCoder Beginner Contest 265 | B - Explore
 * </a>
 */
public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        long t = Long.parseLong((sc.next()));

        sc.nextLine();

        int[] aarray = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            aarray[i] = Integer.parseInt(sc.next());
        }

        sc.nextLine();

        int[] yarray = new int[n];
        for (int i = 0; i < m; i++) {
            int x = Integer.parseInt(sc.next()) - 1;
            yarray[x] = Integer.parseInt(sc.next());
            sc.nextLine();
        }

        for (int i = 0; i < n - 1; i++) {
            if (t <= aarray[i]) {
                System.out.println("No");
                return;
            }
            t -= aarray[i];
            t += yarray[i + 1];
        }
        System.out.println("Yes");
    }
}