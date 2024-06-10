import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        
        //정렬하기
        Arrays.stream(num_list).toArray();
        Arrays.sort(num_list);
        
        int[] answer = new int[num_list.length - 5];
        int n = num_list.length - 1;
        
        for(int i = answer.length - 1; i >= 0; i--){
            answer[i] = num_list[n];
            n--;
        }
        
        return answer;
    }
}