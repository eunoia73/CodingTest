class Solution {
    public String solution(String myString) {
        
        String answer = "";
        //1. 다 소문자로 만들기
        String myString1 = myString.toLowerCase();
        
        //2. char 배열로 변환하기
        char[] result = myString1.toCharArray();
        
        //3. a와 같은지 확인 후 대문자로 변환하기
        for(int i = 0; i < result.length; i++){
            if(result[i] == 'a'){
                result[i] = 'A';
            }
            answer += result[i];  //char배열을 String에 넣기
        }
                
        return answer;
    }
}