import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 개수 세기
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        int num = scanner.nextInt();

        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) answer++;
        }
        System.out.println(answer);
 

    }
}
