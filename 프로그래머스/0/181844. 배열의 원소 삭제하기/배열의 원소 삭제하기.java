import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> arr_list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arr_list.add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    arr_list.remove(Integer.valueOf(arr[i]));
                }
            }
        }

        //list를 다시 배열로
        int[] answer = new int[arr_list.size()];
        for (int i = 0; i < arr_list.size(); i++) {
            answer[i] = arr_list.get(i).intValue();
        }
        
        return answer;
    }
}