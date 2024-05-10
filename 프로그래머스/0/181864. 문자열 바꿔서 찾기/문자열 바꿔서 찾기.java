class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String changed = myString.replace("A","C").replace("B","A").replace     ("C","B");
        answer = changed.contains(pat) == true ? 1 : 0;
        return answer;
    }
}