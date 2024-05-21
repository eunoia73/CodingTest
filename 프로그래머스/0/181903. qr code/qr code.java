class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        char[] code_arr = code.toCharArray();
        for(int i = 0; i<code_arr.length; i++){
            if(i % q == r){
                answer += code_arr[i];
            }
        }
        return answer;
    }
}