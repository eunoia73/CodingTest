import java.util.ArrayList;
import java.util.List;


class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();
        //flag[i]가 true라면 X의 뒤에 arr[i]를 arr[i] × 2 번 추가하고,
        //flag[i]가 false라면 X에서 마지막 arr[i]개의 원소를 제거한 뒤 X를 return
        for (int i = 0; i < flag.length; i++) {
            if (flag[i] == true) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    list.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    list.remove(list.size() - 1);
                }
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
    return result;
    }
}