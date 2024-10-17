import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        char[] arr = next.toCharArray();
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if ('A' <= arr[i] && arr[i] <= 'C') result += 3;
            if ('D' <= arr[i] && arr[i] <= 'F') result += 4;
            if ('G' <= arr[i] && arr[i] <= 'I') result += 5;
            if ('J' <= arr[i] && arr[i] <= 'L') result += 6;
            if ('M' <= arr[i] && arr[i] <= 'O') result += 7;
            if ('P' <= arr[i] && arr[i] <= 'S') result += 8;
            if ('T' <= arr[i] && arr[i] <= 'V') result += 9;
            if ('W' <= arr[i] && arr[i] <= 'Z') result += 10;
        }
        System.out.println(result);


    }
}
