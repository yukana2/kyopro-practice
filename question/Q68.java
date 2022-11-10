import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * <a href="https://atcoder.jp/contests/abc223/tasks/abc223_b">
 * AtCoder Beginner Contest 223 | B - String Shifting
 * </a>
 */
public class Q68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        List<String> strings = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            String substring1 = s.substring(i);
            String substring2 = s.substring(0, i);
            stringBuilder.append(substring1);
            stringBuilder.append(substring2);
            strings.add(stringBuilder.toString());
        }

        List<String> sorted = strings.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted.get(0));
        System.out.println(sorted.get(sorted.size() - 1));
    }
}