import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc213/tasks/abc213_b">
 * AtCoder Beginner Contest 213 | B - Booby Prize
 * </a>
 */
public class Q78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        sc.nextLine();

        int[] aArr = new int[n];
        for (int i = 0; i < n; i++) {
            aArr[i] = Integer.parseInt(sc.next());
        }

        int bottomIndex= -1;
        int bottomValue = -1;
        int boobyIndex = -1;
        int boobyValue = -1;
        for (int i = 0; i < n; i++) {
            int a = aArr[i];
            if (a > boobyValue) {
                if (a > bottomValue) {
                    boobyIndex = bottomIndex;
                    boobyValue = bottomValue;
                    bottomIndex = i;
                    bottomValue = a;
                    continue;
                }
                boobyIndex = i;
                boobyValue = a;
            }
        }
        System.out.println(boobyIndex + 1);

    }
}