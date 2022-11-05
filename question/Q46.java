import java.util.HashSet;
import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc245/tasks/abc245_b">
 * AtCoder Beginner Contest 245 | B - Mex
 * </a>
 */
public class Q46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());

        HashSet<Integer> an = new HashSet<>();
        for (int i = 0; i < n; i++) {
            an.add(Integer.parseInt(sc.next()));
        }

        int i;
        for (i = 0; i < 2002; i++) {
            if (!an.contains(i)) {
                break;
            }
        }

        System.out.println(i);
    }
}