class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        while (myString.length() >= pat.length()) {
            if (myString.substring(0, pat.length()).equals(pat)) answer++;
            myString = myString.substring(1, myString.length());

        }
        return answer;
    }
}