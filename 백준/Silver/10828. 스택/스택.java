import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // 스택
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n = scanner.nextInt();  //명령의 수
        int[] result = new int[n];  //결과 저장할 배열
        int index = 0;

        for (int i = 1; i <= n; i++) {
            String next = scanner.next();
            if (next.equals("push")) {
                int pushInt = scanner.nextInt();
                stack.push(pushInt);
            } else if (next.equals("pop")) {
                if (stack.empty()) {
                    result[index++] = -1;
                } else {
                    result[index++] = stack.pop();
                }
            } else if (next.equals("size")) {
                {
                    result[index++] = stack.size();
                }
            } else if (next.equals("empty")) {
                if (stack.empty()) {
                    result[index++] = 1;
                } else {
                    result[index++] = 0;
                }
            } else if (next.equals("top")) {
                if (stack.empty()) {
                    result[index++] = -1;
                } else {
                    result[index++] = stack.peek();
                }
            }

        }

        for (int i = 0; i < index; i++) {
            System.out.println(result[i]);
        }
    }
}
