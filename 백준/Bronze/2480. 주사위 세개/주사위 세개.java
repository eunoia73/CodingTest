import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 주사위 세 개
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int result = 0;

        if (a == b && b == c) {
            result = 10000 + a * 1000;
        } else if (a != b && b != c && a != c) {
            if (a > b && a > c) {
                result = a * 100;
            } else if (b > a && b > c) {
                result = b * 100;
            } else {
                result = c * 100;
            }
        } else {
            if (a == b) result = 1000 + a * 100;
            else if (b == c) result = 1000 + b * 100;
            else result = 1000 + c * 100;
        }
        System.out.println(result);
    }
}
