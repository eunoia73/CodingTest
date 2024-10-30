import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] answer = new int[6];
        for (int i = 0; i < 6; i++) {
            answer[i] = chess[i] - arr[i];
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }

    }
}
