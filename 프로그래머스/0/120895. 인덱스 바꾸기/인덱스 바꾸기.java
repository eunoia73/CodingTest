class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        //자리변경
        char[] arr = my_string.toCharArray();
        char temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;

        for (char c : arr) {
            answer += c;
        }
        return answer;
    }
}