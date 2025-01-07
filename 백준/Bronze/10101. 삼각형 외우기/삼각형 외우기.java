import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //삼각형 외우기
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b + c != 180) System.out.println("Error");
        else if (a == 60 && a == b && b == c) System.out.println("Equilateral");
        else if (a != b && a != c && b != c) System.out.println("Scalene");
        else System.out.println("Isosceles");
 
    }
}
