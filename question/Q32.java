import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc259/tasks/abc259_b">
 * AtCoder Beginner Contest 259 | B - Counterclockwise Rotation
 * </a>
 */
public class Q32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        double r = d * Math.PI / 180;

        double x = Math.cos(r) * a - Math.sin(r) * b;
        double y = Math.sin(r) * a + Math.cos(r) * b;
        System.out.println(x + " " + y);
    }
}