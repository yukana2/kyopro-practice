import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * <a href="https://atcoder.jp/contests/abc238/tasks/abc238_b">
 * AtCoder Beginner Contest 238 | B - Pizza
 * </a>
 */
public class Q53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        sc.nextLine();
        int[] an = new int[n];
        for (int i = 0; i < n; i++) {
            an[i] = Integer.parseInt(sc.next());
        }

        List<Integer> angles = new ArrayList<>();
        angles.add(0);
        for (int i = 0; i < n; i++) {
            int rotation = an[i];
            List<Integer> next = new ArrayList<>();
            next.add(0);
            for (Integer angle : angles) {
                int nextAngle = angle + rotation;
                if (nextAngle >= 360) {
                    nextAngle -= 360;
                }
                next.add(nextAngle);
            }
            angles = next;
        }
        List<Integer> sorted = angles.stream().sorted().collect(Collectors.toList());
        sorted.add(360);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < sorted.size() - 1; i++) {
            int diff = sorted.get(i + 1) - sorted.get(i);
            max = Math.max(diff, max);
        }
        System.out.println(max);
    }
}