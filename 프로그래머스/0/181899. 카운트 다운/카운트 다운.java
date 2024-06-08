class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start - end_num + 1];
        int n = 0; 
        
        while(end_num <= start){
            answer[n] = start;
            start--;
            n++;
        }
        return answer;
    }
}