import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc264/tasks/abc264_b">
 * AtCoder Beginner Contest 264 | B - Nice Grid
 * </a>
 */
public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());

        if (Math.max(Math.abs(r - 8), Math.abs(c - 8)) % 2 == 1) {
            System.out.println("black");
            return;
        }
        System.out.println("white");
    }
}