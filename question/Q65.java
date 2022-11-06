import java.util.*;

/**
 * <a href="https://atcoder.jp/contests/abc226/tasks/abc226_b">
 * AtCoder Beginner Contest 226 | B - Counting Arrays
 * </a>
 */
public class Q65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        sc.nextLine();

        Set<List<Integer>> aSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int l = Integer.parseInt(sc.next());
            List<Integer> aList = new ArrayList<>();
            for (int j = 0; j < l; j++) {
                aList.add(Integer.parseInt(sc.next()));
            }
            aSet.add(aList);
            sc.nextLine();
        }
        System.out.println(aSet.size());
    }
}