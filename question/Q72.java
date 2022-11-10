import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc219/tasks/abc219_b">
 * AtCoder Beginner Contest 219 | B - Maritozzo
 * </a>
 */
public class Q72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        String t = sc.nextLine();

        String[] strings = {s1, s2, s3};
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < t.length(); i++) {
            int j = t.charAt(i) - '0' - 1;
            stringBuilder.append(strings[j]);
        }
        System.out.println(stringBuilder);
    }
}