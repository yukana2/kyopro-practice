import java.util.*;

/**
 * <a href="https://atcoder.jp/contests/abc268/tasks/abc268_c">
 * AtCoder Beginner Contest 268 | C - Chinese Restaurant
 * </a>
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Integer> plist = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            plist.add(sc.nextInt());
        }
        System.out.println(solve(n, plist));
    }

    static int solve(int n, List<Integer> list) {
        int[] ints = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                ints[(list.get(i) - i - 1 + j + n) % n]++;
            }
        }

        return Arrays.stream(ints).max().orElse(0);
    }
}