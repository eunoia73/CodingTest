class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String before = my_string.substring(0,s);
        String after = my_string.substring(e+1);
        
        //뒤집기
        StringBuilder sb = new StringBuilder();
        sb.append(my_string.substring(s, e+1));
        sb.reverse();
        
        answer = before + sb + after;
        return answer;
    }
}