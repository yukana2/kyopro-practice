import java.util.ArrayList;
import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc271/tasks/abc271_b">
 * AtCoder Beginner Contest 271 | B - Maintain Multiple Sequences
 * </a>
 */
public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        sc.nextLine();

        ArrayList<ArrayList<String>> ls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int li = Integer.parseInt(sc.next());
            ArrayList<String> as = new ArrayList<>();
            for (int j = 0; j < li; j++) {
                as.add(sc.next());
            }
            ls.add(as);
            sc.nextLine();
        }

        for (int i = 0; i < q; i++) {
            String[] st = sc.nextLine().split(" ");
            int s = Integer.parseInt(st[0]);
            int t = Integer.parseInt(st[1]);
            System.out.println(ls.get(s - 1).get(t - 1));
        }
    }
}