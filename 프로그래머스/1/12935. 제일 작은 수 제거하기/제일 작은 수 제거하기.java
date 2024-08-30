import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
         int[] answer;
        //배열 길이가 1이면 -1 반환
        if (arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            Integer min = arr[0];
            List<Integer> arr_list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) min = arr[i];
                arr_list.add(arr[i]);
            }
            arr_list.remove(min);

            //배열로 변경하기
            answer = new int[arr_list.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = arr_list.get(i);
            }
        }
        return answer;
    }
}