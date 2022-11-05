import java.util.ArrayList;
import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc241/tasks/abc241_b">
 * AtCoder Beginner Contest 241 | B - Minimize Ordering
 * </a>
 */
public class Q50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        sc.nextLine();

        ArrayList<Long> an = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            an.add(Long.parseLong(sc.next()));
        }
        sc.nextLine();

        ArrayList<Long> bm = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            bm.add(Long.parseLong(sc.next()));
        }

        boolean enable = true;
        for (int i = 0; i < m; i++) {
            long b = bm.get(i);
            if (an.contains(b)) {
                an.remove(b);
            } else {
                enable = false;
                break;
            }
        }

        if (enable) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}