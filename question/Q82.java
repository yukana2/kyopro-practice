import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * <a href="https://atcoder.jp/contests/abc273/tasks/abc273_c">
 * AtCoder Beginner Contest 273 | C - (K+1)-th Largest Number
 * </a>
 */
public class Q82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        sc.nextLine();
        List<Integer> aList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            aList.add(Integer.parseInt(sc.next()));
        }

        Map<Integer, Long> collect = aList
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        for (Map.Entry<Integer, Long> integerLongEntry : collect.entrySet()) {
            System.out.println(integerLongEntry.getValue());
        }

        for (int i = 0; i < n - collect.size(); i++) {
            System.out.println(0);
        }
    }
}