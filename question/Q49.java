import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * <a href="https://atcoder.jp/contests/abc242/tasks/abc242_b">
 * AtCoder Beginner Contest 242 | B - Minimize Ordering
 * </a>
 */
public class Q49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] chars = s.toCharArray();

        ArrayList<String> strings = new ArrayList<>();
        for (char aChar : chars) {
            strings.add(String.valueOf(aChar));
        }

        String result = strings.stream().sorted().collect(Collectors.joining());
        System.out.println(result);
    }
}