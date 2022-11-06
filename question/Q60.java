import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * <a href="https://atcoder.jp/contests/abc231/tasks/abc231_b">
 * AtCoder Beginner Contest 231 | B - Election
 * </a>
 */
public class Q60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Integer> counter = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            Integer count = counter.get(s);
            if (count == null) {
                count = 0;
            }
            count++;
            counter.put(s, count);
        }

        List<Map.Entry<String, Integer>> collect = counter
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
                .collect(Collectors.toList());
        System.out.println(collect.get(0).getKey());
    }
}