import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = n - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
         * i = 4  1
         * i = 3  2
         * i = 2  3
         * i = 1  4
         * i = 0  5
         *
         * */

    }
}
