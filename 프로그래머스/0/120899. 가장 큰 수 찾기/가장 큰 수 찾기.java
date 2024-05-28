import java.util.Arrays;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int[] array2 = {};
        array2 = array.clone();
        Arrays.sort(array);
        
        //최대값 구하기
        int max = array[array.length -1];
        answer[0] = max;
        
        //최대값 위치 구하기
        for(int i = 0; i<array2.length; i++){
            if(max == array2[i]){
                answer[1] = i;
            }
        }
        return answer;
    }
}