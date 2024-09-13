import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //배수와 약수
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        String answer = "";

        while (true) {
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();

            if (num1 == 0 && num2 == 0){
                System.out.println(answer);
                break;
            }

            if (num2 % num1 == 0) {
                answer += "factor\n";
            } else if (num1 % num2 == 0) {
                answer += "multiple\n";
            } else {
                answer += "neither\n";
            }



        }

    }
}
