import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc255/tasks/abc255_a">
 * AtCoder Beginner Contest 255 | A - You should output ARC, though this is ABC.
 * </a>
 */
public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a11 = sc.nextInt();
        int a12 = sc.nextInt();
        int a21 = sc.nextInt();
        int a22 = sc.nextInt();
        int[][] ints = new int[2][2];
        ints[0][0] = a11;
        ints[0][1] = a12;
        ints[1][0] = a21;
        ints[1][1] = a22;
        System.out.println(ints[r - 1][c - 1]);
    }
}