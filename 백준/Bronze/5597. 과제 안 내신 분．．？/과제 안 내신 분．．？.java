import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 30 ; i++) {
            list.add(i);
        }

        for (int i = 0; i < 28; i++) {
            Integer a = scanner.nextInt();
            if (list.contains(a)) list.remove(a);
        }

        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
