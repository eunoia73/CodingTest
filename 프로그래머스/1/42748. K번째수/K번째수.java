import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index2 = 0;


        for (int j = 0; j < commands.length; j++) {
            int index1 = 0;
            int[] arr = new int[commands[j][1] - commands[j][0] + 1];
            for (int i = commands[j][0] - 1; i < commands[j][1]; i++) {
                arr[index1++] = array[i];
            }

            //정렬하기
            Arrays.sort(arr);

            //배열에 숫자 넣기
            answer[index2++] = arr[commands[j][2] - 1];

        }
        
        return answer;
    }
}