import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> arr_list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                arr_list.add(arr[i]);
            }
        }

        //배열로 변환
        int[] answer;
        if (arr_list.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        }else {
            answer = new int[arr_list.size()];
        }

        for (int i = 0; i < arr_list.size(); i++) {
            answer[i] = arr_list.get(i);
        }
        Arrays.sort(answer);
        
        return answer;
    }
}