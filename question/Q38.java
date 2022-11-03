import java.util.ArrayList;
import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc253/tasks/abc253_b">
 * AtCoder Beginner Contest 253 | B - Distance Between Tokens
 * </a>
 */
public class Q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        sc.nextLine();

        ArrayList<Integer> piecesi = new ArrayList<>();
        ArrayList<Integer> piecesj = new ArrayList<>();
        for (int i = 0; i < h; i++) {
            char[] chars = sc.nextLine().toCharArray();
            for (int j = 0; j < w; j++) {
                if (chars[j] == 'o') {
                    piecesi.add(i);
                    piecesj.add(j);
                }
            }
        }

        int d = Math.abs(piecesi.get(0) - piecesi.get(1)) + Math.abs(piecesj.get(0) - piecesj.get(1));
        System.out.println(d);
    }
}