import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  //명령 개수
        int[][] arr = new int[n][4];

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            arr[i][0] = a / 25;
            a = a % 25;
            arr[i][1] = a / 10;
            a = a % 10;
            arr[i][2] = a / 5;
            a = a % 5;
            arr[i][3] = a;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
