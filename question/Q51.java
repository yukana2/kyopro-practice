import java.util.HashSet;
import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc240/tasks/abc240_b">
 * AtCoder Beginner Contest 240 | B - Count Distinct Integers
 * </a>
 */
public class Q51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        sc.nextLine();
        HashSet<Integer> an = new HashSet<>();
        for (int i = 0; i < n; i++) {
            an.add(Integer.parseInt(sc.next()));
        }

        System.out.println(an.size());
    }
}