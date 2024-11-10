import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String s = br.readLine();
        char[] arr = s.toCharArray();
        int result  = 0;
        for (int i = 0; i < arr.length; i++) {
            result += Integer.parseInt(String.valueOf(arr[i]));
        }

        bw.write(String.valueOf(result));
        br.close();
        bw.flush();
        bw.close();

    }
}
