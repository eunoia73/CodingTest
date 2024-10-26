import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // 명령 개수
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            char[] arr = scanner.next().toCharArray();
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < a; k++) {
                    System.out.print(arr[j]);
                }
            }
            System.out.println();
        }
    }
}
