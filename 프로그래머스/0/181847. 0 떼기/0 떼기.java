class Solution {
    public String solution(String n_str) {
        
        String answer = "";

        //1. 0이 아닌 첫 번째 수의 index 구하기
        int index = 0; 
        for(int i = 0; i < n_str.length(); i++){
            if(n_str.charAt(i) != '0'){
                index = i;
                break;
            }
        }
        
        //2. 그 index부터 마지막까지 문자열을 구한다
        answer = n_str.substring(index);
        
        return answer;
    }
}