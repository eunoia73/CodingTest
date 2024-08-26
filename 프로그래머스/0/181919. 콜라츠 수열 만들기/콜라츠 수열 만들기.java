import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
       List<Integer> list = new ArrayList<>();
        list.add(n);

        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            list.add(n);
        }

        //다시 배열로 변경
        int[] answer = new int[list.size()];
        int index = 0;
        for (Integer i : list) {
            answer[index++] = (int) i;
        }
        
        return answer;
    }
}