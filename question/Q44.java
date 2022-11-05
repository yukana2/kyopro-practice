import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc247/tasks/abc247_b">
 * AtCoder Beginner Contest 247 | B - Unique Nicknames
 * </a>
 */
public class Q44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());

        String[] s = new String[n];
        String[] t = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
            t[i] = sc.next();
            sc.nextLine();
        }

        boolean enableS = true;
        boolean enableT = true;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s[i].equals(s[j]) || s[i].equals(t[j])) {
                    enableS = false;
                }

                if (t[i].equals(s[j]) || t[i].equals(t[j])) {
                    enableT = false;
                }
            }
        }

        if (enableS || enableT) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}