import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * <a href="https://atcoder.jp/contests/abc274/tasks/abc274_b">
 * AtCoder Beginner Contest 274 | B - Line Sensor
 * </a>
 */
public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        sc.nextLine();

        int[] counts = new int[w];
        for (int i = 0; i < h; i++) {
            String s = sc.nextLine();
            List<Character> chars = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
            for (int j = 0; j < w; j++) {
                if (chars.get(j).equals('#')) {
                    counts[j]++;
                }
            }
        }

        String collect = Arrays.stream(counts).mapToObj(String::valueOf).collect(Collectors.joining(" "));
        System.out.println(collect);
    }
}