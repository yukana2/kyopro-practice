import java.util.Arrays;
import java.util.Scanner;

/**
 * <a href="https://atcoder.jp/contests/abc272/tasks/abc272_a">
 * AtCoder Beginner Contest 272 | A - Integer Sum
 * </a>
 */
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int sum = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).sum();
        System.out.println(sum);
    }
}