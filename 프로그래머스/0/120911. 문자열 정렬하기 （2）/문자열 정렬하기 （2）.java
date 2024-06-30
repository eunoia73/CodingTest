import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        //소문자로 변환
        String lower = my_string.toLowerCase();
        System.out.println(lower);

        //사전순 정렬
        char[] arr = lower.toCharArray();
        Arrays.sort(arr);
       
        String answer = "";
        for (char c : arr) {
            answer += c;
        }
        
        return answer;
    }
}