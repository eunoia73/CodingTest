import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //오븐 시계
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();

        int m_re = m + a;
        h = h + (m_re / 60);
        m = m_re % 60;

        if(h >= 24){
            h = h - 24;
        }

        System.out.println(h + " " + m);

    }
}
