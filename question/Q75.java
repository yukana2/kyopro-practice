import java.util.*;

/**
 * <a href="https://atcoder.jp/contests/abc216/tasks/abc216_b">
 * AtCoder Beginner Contest 216 | B - Same Name
 * </a>
 */
public class Q75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        sc.nextLine();

        Set<String> names = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String st = sc.nextLine();
            names.add(st);
        }
        if (names.size() < n) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}