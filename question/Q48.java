import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc243/tasks/abc243_b">
 * AtCoder Beginner Contest 243 | B - Hit and Blow
 * </a>
 */
public class Q48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int[] an = new int[n];
        int[] bn = new int[n];

        sc.nextLine();
        for (int i = 0; i < n; i++) {
            an[i] = Integer.parseInt(sc.next());
        }
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            bn[i] = Integer.parseInt(sc.next());
        }

        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (an[i] == bn[i]) {
                count1++;
            }
        }

        int count2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && an[i] == bn[j]) {
                    count2++;
                }
            }
        }

        System.out.println(count1);
        System.out.println(count2);
    }
}