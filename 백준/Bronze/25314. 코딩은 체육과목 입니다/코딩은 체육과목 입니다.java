import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int i = 1; i <= a/4 ; i++) {
            System.out.print("long ");
        }
        System.out.print("int");
 
    }
}
