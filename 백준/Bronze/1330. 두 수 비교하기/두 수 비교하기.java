import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //두 수 비교하기
        Scanner scanner = new Scanner(System.in);
        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();

        if (s1 < s2) System.out.println("<");
        else if (s1 > s2) {
            System.out.println(">");
        } else System.out.println("==");
    }
}
