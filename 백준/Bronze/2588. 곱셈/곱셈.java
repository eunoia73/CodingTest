import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int c = a * (b % 10);
        b = b / 10;
        int d = a * (b % 10);
        b = b / 10;
        int e = a * (b % 10);

        int f = c + 10 * d + 100 * e;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
