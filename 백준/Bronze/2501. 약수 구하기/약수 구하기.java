import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //약수 구하기
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] arr = new int[a];
        int index = 0;

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                arr[index++] = i;
            }
        }
        System.out.println(arr[b-1]);

    }
}
