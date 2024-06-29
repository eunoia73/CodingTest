class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int num = 0;
        //n부터 끝까지
        for(int i = n; i< num_list.length; i++){
            answer[num] = num_list[i];
            num++;
        }
        
        //맨앞에서 n까지
        int num2 = num_list.length - n;
        for(int i = 0; i < n; i++){
            answer[num2] = num_list[i];
            num2++;
            
        }
        
        return answer;
    }
}