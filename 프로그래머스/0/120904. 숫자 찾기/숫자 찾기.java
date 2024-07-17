class Solution {
    public int solution(int num, int k) {        
        String num_string = num + "";
        String k_string = k + "";

        int answer = num_string.indexOf(k_string);
        answer = answer == -1 ? -1 : answer + 1;
        
        return answer;
    }
}