import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        int n = array.length / 2;  //중앙값 index
        answer = array[n];
        return answer;
    }
}