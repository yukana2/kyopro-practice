import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * <a href="https://atcoder.jp/contests/abc237/tasks/abc237_b">
 * AtCoder Beginner Contest 237 | B - Matrix Transposition
 * </a>
 */
public class Q54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        sc.nextLine();

        int[][] a = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                a[i][j] = Integer.parseInt(sc.next());
            }
        }

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                if (j == h - 1) {
                    System.out.print(a[j][i]);
                } else {
                    System.out.print(a[j][i] + " ");
                }
            }
            System.out.println();
        }
    }
}