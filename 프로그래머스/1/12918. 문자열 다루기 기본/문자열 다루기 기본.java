class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        //길이 
        if(s.length() == 4 || s.length() == 6){
            //숫자로만 구성되어있는지 확인 
            for(int i = 0; i < s.length(); i++){
                if(!('0' <= s.charAt(i) && s.charAt(i) <= '9'))  {
                    answer = false; 
                        break;}
                else{answer = true;}
            }
        }else answer = false;
        
        return answer;
    }
}