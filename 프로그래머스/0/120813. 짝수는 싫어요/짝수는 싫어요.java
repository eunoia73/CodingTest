class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n + 1) / 2];
        int k = 0;

        //0에서 n까지 증가할 때, 홀수만 배열에 담기
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                answer[k] = i;
                k++;
            }
        }
        return answer;
    }
}