import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cost = scanner.nextInt();
        int n = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            result += (a * b);
        }
        if (cost == result) System.out.println("Yes");
        else System.out.println("No");

    }
}
