class Solution {
    public int solution(int n) {
        int answer = 0;
        int start = 0;
        
        //짝수일 경우
        if(n % 2 == 0){
            while (start <= n){
                answer += (start * start);
                start += 2;
            }
        }else{  //홀수일 경우
            start = 1;
            while (start <= n){
                answer += start;
                start += 2;
            }
        }
        
        return answer;
    }
}