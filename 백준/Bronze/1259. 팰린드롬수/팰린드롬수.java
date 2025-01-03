import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = "";
        String answer = "";
        while (next != "0") {
            next = scanner.next();
            if (next.equals("0")) break;

            String reverse = new StringBuilder(next).reverse().toString();
            if(next.equals(reverse)) answer = "yes";
            else answer = "no";
            System.out.println(answer);
        }
    }
}
