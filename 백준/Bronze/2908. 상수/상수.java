import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 상수
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();

        StringBuilder sb_a = new StringBuilder(a);
        int a_re = Integer.parseInt(sb_a.reverse().toString());
        StringBuilder sb_b = new StringBuilder(b);
        int b_re = Integer.parseInt(sb_b.reverse().toString());
        if (a_re > b_re) System.out.println(a_re);
        else System.out.println(b_re);

    }
}
