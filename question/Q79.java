import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * <a href="https://atcoder.jp/contests/abc275/tasks/abc275_b">
 * AtCoder Beginner Contest 275 | B - Counting Squares
 * </a>
 */
public class Q79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = sc.nextLine();
        List<Integer> xList = x.chars().mapToObj(i -> i - '0').collect(Collectors.toList());

        boolean same = true;
        boolean step = true;
        for (int i = 1; i < xList.size(); i++) {
            int prev = xList.get(i - 1);
            int next = xList.get(i);
            if (prev != next) {
                same = false;
            }
            if (next != (prev + 1) % 10) {
                step = false;
            }
        }

        if (same || step) {
            System.out.println("Weak");
        } else {
            System.out.println("Strong");
        }
    }
}