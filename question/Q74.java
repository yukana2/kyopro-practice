import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc217/tasks/abc217_b">
 * AtCoder Beginner Contest 217 | B - AtCoder Quiz
 * </a>
 */
public class Q74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strings = {"ABC", "ARC", "AGC", "AHC"};
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        for (String string : strings) {
            if (!string.equals(s1) && !string.equals(s2) && !string.equals(s3)) {
                System.out.println(string);
                return;
            }
        }
    }
}