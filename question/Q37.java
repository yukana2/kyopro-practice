import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * <a href="https://atcoder.jp/contests/abc254/tasks/abc254_b">
 * AtCoder Beginner Contest 254 | B - Practical Computing
 * </a>
 */
public class Q37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        int[][] narr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    narr[i][j] = 1;
                    continue;
                }
                narr[i][j] = narr[i - 1][j - 1] + narr[i - 1][j];
            }
        }

        for (int[] ints : narr) {
            String collect = Arrays.stream(ints).filter(i -> i != 0).mapToObj(String::valueOf).collect(Collectors.joining(" "));
            System.out.println(collect);
        }
    }
}