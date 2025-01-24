import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main { 

    //EOF end of file
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            String s = scanner.nextLine();
            String[] split = s.split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            System.out.println(a + b);
        }

    }
}
