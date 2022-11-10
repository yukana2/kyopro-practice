import java.util.Arrays;
import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc221/tasks/abc221_b">
 * AtCoder Beginner Contest 221 | B - typo
 * </a>
 */
public class Q70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        boolean enabled = s.equals(t);

        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length() - 1; i++) {
            char[] tmp = Arrays.copyOf(chars, chars.length);
            tmp[i + 1] = chars[i];
            tmp[i] = chars[i + 1];
            if (String.valueOf(tmp).equals(t)) {
                enabled = true;
                break;
            }
        }

        if (enabled) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}