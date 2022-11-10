import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc218/tasks/abc218_b">
 * AtCoder Beginner Contest 218 | B - qwerty
 * </a>
 */
public class Q73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] pArr = new int[26];
        for (int i = 0; i < 26; i++) {
            pArr[i] = Integer.parseInt(sc.next()) - 1;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int p : pArr) {
            char c = (char) ((int) 'a' + p);
            stringBuilder.append(c);
        }
        System.out.println(stringBuilder);

    }
}