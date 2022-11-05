import java.util.HashSet;
import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc249/tasks/abc249_b">
 * AtCoder Beginner Contest 249 | B - Perfect String
 * </a>
 */
public class Q42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] chars = s.toCharArray();

        boolean containsUppercase = false;
        boolean containsLowercase = false;
        HashSet<Character> characters = new HashSet<>();
        for (char aChar : chars) {
            String before = String.valueOf(aChar);

            String after1 = before.toUpperCase();
            if (before.equals(after1)) {
                containsUppercase = true;
            }

            String after2 = before.toLowerCase();
            if (before.equals(after2)) {
                containsLowercase = true;
            }

            characters.add(aChar);
        }

        if (containsUppercase && containsLowercase && characters.size() == chars.length) {
            System.out.println("Yes");
            return;
        }

        System.out.println("No");
    }
}