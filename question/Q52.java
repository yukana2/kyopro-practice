import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc239/tasks/abc239_b">
 * AtCoder Beginner Contest 239 | B - Integer Division
 * </a>
 */
public class Q52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigDecimal x = BigDecimal.valueOf(Long.parseLong(sc.next()));
        BigDecimal divide = x.divide(BigDecimal.valueOf(10), 0, RoundingMode.FLOOR);
        System.out.println(divide.toBigInteger());
    }
}