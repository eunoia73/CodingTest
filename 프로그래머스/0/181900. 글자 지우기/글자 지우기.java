class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        //제거
        char[] arr = my_string.toCharArray();
        for (int i = 0; i < indices.length; i++) {
            arr[indices[i]] = ' ';
        }
        //문자열로 만들기
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        //공백제거
        answer = answer.replace(" ","");
        

        return answer;
    }
}