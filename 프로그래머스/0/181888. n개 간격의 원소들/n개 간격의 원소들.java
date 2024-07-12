class Solution {
    public int[] solution(int[] num_list, int n) {
        int k = num_list.length % n == 0 ? num_list.length / n : num_list.length / n + 1;
        int[] answer = new int[k];    
        
          answer[0] = num_list[0];
        for (int i = 0; i < answer.length - 1; i++) {
            answer[i + 1] = num_list[n * (i + 1)];
        }
        return answer;
    }
}