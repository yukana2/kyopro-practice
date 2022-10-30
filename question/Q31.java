import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc261/tasks/abc261_b">
 * AtCoder Beginner Contest 261 | B - Tournament Result
 * </a>
 */
public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());

        char[][] scores = new char[n][n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.next().toCharArray();
        }

        boolean correct = true;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (scores[i][j] == 'W' && scores[j][i] == 'L') {
                    continue;
                }
                if (scores[i][j] == 'L' && scores[j][i] == 'W') {
                    continue;
                }
                if (scores[i][j] == 'D' && scores[j][i] == 'D') {
                    continue;
                }
                correct = false;
            }
        }

        if (!correct) {
            System.out.println("incorrect");
            return;
        }
        System.out.println("correct");
    }
}