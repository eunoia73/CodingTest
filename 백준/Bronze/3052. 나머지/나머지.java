import java.io.*;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        //나머지
        Scanner scanner = new Scanner(System.in);

        //중복 인정X -> Set
        Set<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < 10; i++) {
            int a = scanner.nextInt();
            set.add(a % 42);
        }
        System.out.println(set.size());
    }
}
