class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        String re_my = my_string.replaceAll("\\s+"," ");
        answer = re_my.trim().split(" ");


        
        return answer;
    }
}