class Solution {
    public String solution(String my_string, int n) {
        int all = my_string.length();
        String answer = my_string.substring(all-n);
        return answer;
    }
}