import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] arr = new int[a][b];
        int[][] arr2 = new int[a][b];
        int[][] answer = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                answer[i][j] = arr[i][j] + arr2[i][j];
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }



    }
}
