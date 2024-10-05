import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // 제로
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  //명령 수

        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <= n; i++) {
            int a = scanner.nextInt();
            if (a == 0){
                stack.pop();
            }else {
                stack.push(a);
            }
        }

        int result = 0;
        //비어있으면 0
        if (stack.empty()) {
            System.out.println(0);
        }else{
            for (int i = 0; i < stack.size(); i++) {
                result += stack.get(i);
            }
            System.out.println(result);

        }
    }
}
