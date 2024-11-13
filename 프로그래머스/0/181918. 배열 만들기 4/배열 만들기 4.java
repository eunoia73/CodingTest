import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
         int i = 0;

        List<Integer> stk_list = new ArrayList<>();

        while (i < arr.length) {
            if (stk_list.size() == 0) {
                stk_list.add(arr[i]);
                i += 1;
            }else{
                if (stk_list.get(stk_list.size()-1) < arr[i]){
                    stk_list.add(arr[i]);
                    i++;
                }else {
                    stk_list.remove(stk_list.size() - 1);
                }
            }

        }

        //배열로 변환
        int[] result = new int[stk_list.size()];
        for (int j = 0; j < stk_list.size(); j++) {
            result[j] = stk_list.get(j);
        }
        
        return result;
    }
}