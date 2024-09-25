import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //알람 시계
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        //45분 빼기
        if (b < 45) {
            if (a == 0) {
                a = 23;
            } else {
                a -= 1;
            }
            b = (b + 60) - 45;
        } else {
            b -= 45;
        }

        System.out.println(a + " " + b);

    }
}
