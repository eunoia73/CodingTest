class Solution {
    boolean solution(String s) {

        String a = s.toLowerCase();
        int num_p = 0;
        int num_y = 0;
        boolean answer = false;
         
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'p') {
                num_p++;
            } else if (a.charAt(i) == 'y') {
                num_y++;
            }
        }
        
        if(num_p == num_y) answer = true;
        
        return answer;
    }
}