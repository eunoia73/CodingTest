class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int a_num = 0;
        int d_num = 0;
        
         for(int i = 0; i<included.length; i++){
            if(included[i] == true){
                a_num++;
                d_num += i;
            }
        }
        answer = a * a_num + d * d_num;

        return answer;
    }
}