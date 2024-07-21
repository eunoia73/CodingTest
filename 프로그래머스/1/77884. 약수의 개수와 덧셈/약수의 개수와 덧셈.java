class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int num = 0;  //약수 개수

        for (int i = left; i <= right; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    num++;
                }
            }
           
            //약수의 개수가 짝수이면 더하기
            if (num % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
            num = 0; //새로 for문 돌 때 num 0으로 초기화
        }
        return answer;
    }
}