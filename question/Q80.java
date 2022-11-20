import java.util.*;
import java.util.stream.Collectors;

/**
 * <a href="https://atcoder.jp/contests/abc275/tasks/abc275_c">
 * AtCoder Beginner Contest 275 | C - Counting Squares
 * </a>
 */
public class Q80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] dots = new char[9][9];
        for (int i = 0; i < 9; i++) {
            dots[i] = sc.nextLine().toCharArray();
        }

        List<Integer> pawnXList = new ArrayList<>();
        List<Integer> pawnYList= new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (dots[i][j] == '#') {
                    pawnXList.add(i + 1);
                    pawnYList.add(j + 1);
                }
            }
        }

        int count = 0;
        int size = pawnXList.size();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                for (int k = j + 1; k < size; k++) {
                    for (int l = k + 1; l < size; l++) {
                        List<Integer> xList = new ArrayList<>();
                        xList.add(pawnXList.get(i));
                        xList.add(pawnXList.get(j));
                        xList.add(pawnXList.get(k));
                        xList.add(pawnXList.get(l));

                        ArrayList<Integer> yList = new ArrayList<>();
                        yList.add(pawnYList.get(i));
                        yList.add(pawnYList.get(j));
                        yList.add(pawnYList.get(k));
                        yList.add(pawnYList.get(l));

                        if (isSquare(xList, yList)) {
                            count++;
                        }
                    }
                }
            }
        }

        System.out.println(count);
    }
    private static boolean isSquare(List<Integer> xList, List<Integer> yList) {
        List<Integer> dList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                int dx = xList.get(i) - xList.get(j);
                int dy = yList.get(i) - yList.get(j);
                dList.add(dx * dx + dy * dy);
            }
        }

        List<Integer> sorted = dList.stream().sorted().collect(Collectors.toList());

        Integer d = sorted.get(0);
        if (d == 0) {
            return false;
        }

        return Objects.equals(sorted.get(0), d)
        && Objects.equals(sorted.get(1), d)
        && Objects.equals(sorted.get(2), d)
        && Objects.equals(sorted.get(3), d)
        && Objects.equals(sorted.get(4), 2 * d)
        && Objects.equals(sorted.get(5), 2 * d);
    }
}