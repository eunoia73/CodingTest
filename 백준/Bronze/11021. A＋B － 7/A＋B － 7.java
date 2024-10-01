import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            arr[i] = a + b;
        }
        int index = 1;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Case #"+(index++)+": "+arr[i]);
        }
    }
}
