import java.util.HashSet;
import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc251/tasks/abc251_b">
 * AtCoder Beginner Contest 251 | B - At Most 3 (Judge ver.)
 * </a>
 */
public class Q40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        sc.nextLine();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        HashSet<Integer> results = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int ai = a[i];
            if (ai <= w) {
                results.add(ai);
            }
            for (int j = i + 1; j < n; j++) {
                int aj = ai + a[j];
                if (aj <= w) {
                    results.add(aj);
                }
                for (int k = j + 1; k < n; k++) {
                    int ak = aj + a[k];
                    if (ak <= w) {
                        results.add(ak);
                    }
                }
            }
        }
        System.out.println(results.size());

    }
}