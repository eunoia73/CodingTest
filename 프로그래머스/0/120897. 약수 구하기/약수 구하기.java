class Solution {
    public int[] solution(int n) {
        int num = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                num++;
            }
        }

        int[] answer = new int[num];
        answer[0] = 1;
        int index = 1;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                answer[index] = i;
                index++;
            }
        }

        return answer;
    }
}