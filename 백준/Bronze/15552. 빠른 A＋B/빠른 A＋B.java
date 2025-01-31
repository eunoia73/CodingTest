import java.io.*;
import java.util.StringTokenizer;

public class Main { 
    public static void main(String[] args) throws IOException {
        //빠른 A + B
        //Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
        // BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());  //명령 개수

        StringTokenizer st;  //문자열을 쪼개서 가공하기 위함

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write((a + b) + "\n");
        }
        br.close();

        bw.flush();     // 남아있는 데이터 모두 출력
        bw.close();


    }
}
