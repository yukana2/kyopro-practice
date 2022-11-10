import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc220/tasks/abc220_b">
 * AtCoder Beginner Contest 220 | B - Base K
 * </a>
 */
public class Q71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = Integer.parseInt(sc.next());
        sc.nextLine();
        int a = Integer.parseInt(sc.next(), k);
        int b = Integer.parseInt(sc.next(), k);

        System.out.println((long) a * b);
    }
}