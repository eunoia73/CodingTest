import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //공 바꾸기

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();  //바구니
        int b = scanner.nextInt();  //횟수
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = i + 1;
        } 

        for (int i = 0; i < b; i++) {
            int q = scanner.nextInt();
            int w = scanner.nextInt();
            int temp = arr[q - 1];
            arr[q - 1] = arr[w - 1];
            arr[w - 1] = temp;

        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
