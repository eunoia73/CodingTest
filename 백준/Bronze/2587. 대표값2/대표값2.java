import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        int mean = 0;
        for (int i = 0; i <5; i++) {
            arr[i] = scanner.nextInt();
            mean += arr[i];
        }
        mean = mean / 5;
        Arrays.sort(arr);

        System.out.println(mean);
        System.out.println(arr[2]);

    }
}
