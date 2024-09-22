import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //문자열
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.next();
        }

        //출력
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].charAt(0));
            System.out.print(arr[i].charAt(arr[i].length() - 1));
            System.out.println();
        }
    }
}
