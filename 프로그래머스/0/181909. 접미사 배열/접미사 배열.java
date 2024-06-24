import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        for(int i = 0; i < my_string.length(); i++){
            answer[i] = my_string.substring(i);
            System.out.println(answer[i]);
        }
        //이제 이걸 사전순으로 정렬
        Arrays.parallelSort(answer);
        
        return answer;
    }
}