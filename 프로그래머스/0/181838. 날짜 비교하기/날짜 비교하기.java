class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        int dateA = Integer.parseInt("" + date1[0] + date1[1] + date1[2]);
        int dateB = Integer.parseInt("" + date2[0] + date2[1] + date2[2]);
        
         answer = dateA < dateB ? 1 : 0;
 

        return answer;
    }
}