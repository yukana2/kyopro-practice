import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc244/tasks/abc244_b">
 * AtCoder Beginner Contest 244 | B - Go Straight and Turn Right
 * </a>
 */
public class Q47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        char[] t = sc.next().toCharArray();

        int x = 0, y = 0;
        int addx = 1, addy = 0;
        for (char c : t) {
            if (c == 'S') {
                x += addx;
                y += addy;
            }
            if (c == 'R') {
                if (addx == 1) {
                    addx = 0;
                    addy = -1;
                } else if (addy == -1) {
                    addx = -1;
                    addy = 0;
                } else if (addx == -1) {
                    addx = 0;
                    addy = 1;
                } else {
                    addx = 1;
                    addy = 0;
                }
            }
        }

        System.out.println(x + " " + y);
    }
}