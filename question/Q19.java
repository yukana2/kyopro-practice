import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * <a href="https://atcoder.jp/contests/abc272/tasks/abc272_b">
 * AtCoder Beginner Contest 272 | B - Everyone is Friends
 * </a>
 */
public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        boolean[][] booleans = new boolean[n][n];
        for (int i = 0; i < m; i++) {
            List<Integer> xs = Arrays.stream(sc.nextLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList());
            for (int j = 1; j < xs.size(); j++) {
                for (int k = j + 1; k < xs.size(); k++) {
                    int xj = xs.get(j) - 1;
                    int xk = xs.get(k) - 1;
                    booleans[xj][xj] = true;
                    booleans[xk][xk] = true;
                    booleans[xj][xk] = true;
                    booleans[xk][xj] = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!booleans[i][j]) {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}