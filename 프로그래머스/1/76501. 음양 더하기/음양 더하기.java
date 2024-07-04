class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        //false랑 같은 index에 -붙이기
        for (int i = 0; i < signs.length; i++) {
            if (signs[i] == false) {
                absolutes[i] *= (-1);
            }
            answer += absolutes[i];
        }
        return answer;
    }
}