class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        boolean isornot = str2.contains(str1);
        if(isornot==true){
            answer = 1;
        }
        return answer;
    }
}