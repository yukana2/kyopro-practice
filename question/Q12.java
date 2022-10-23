import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc264/tasks/abc258_a">
 * AtCoder Beginner Contest 258 | A - When?
 * </a>
 */
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        LocalTime of = LocalTime.of(21, 0);
        LocalTime plusk = of.plusMinutes(k);
        System.out.println(plusk.format(DateTimeFormatter.ofPattern("HH:mm")));
    }
}