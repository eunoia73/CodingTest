class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
         //길이 11이상이면 원소의 합
        if (num_list.length >= 11) {
            for (int i = 0; i < num_list.length; i++) {
                answer += num_list[i];
            }
        } else {
            //길이 10이하이면 원소의 곱
                answer = 1;
            for (int i = 0; i < num_list.length; i++) {
                answer *= num_list[i];
            }
        }
        return answer;
    }
}