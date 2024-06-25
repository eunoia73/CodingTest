class Solution {
    public int solution(int[] num_list) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < num_list.length; i += 2) {
            //0,2,4
            odd += num_list[i];
        }
        for (int i = 1; i < num_list.length; i += 2) {
            //1,3,5
            even += num_list[i];
        }
        int answer = odd > even ? odd : even;
        
        return answer;
    }
}