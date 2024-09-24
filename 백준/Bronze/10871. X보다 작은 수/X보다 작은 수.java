import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arr = new int[a];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] < n){
                System.out.print(arr[i] + " ");
            }
        }


    }
}
