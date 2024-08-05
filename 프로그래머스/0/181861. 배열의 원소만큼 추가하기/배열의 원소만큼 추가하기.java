class Solution {
    public int[] solution(int[] arr) {
        //새로운 배열 길이 구하기
        int index = 0;
        for (int i : arr) {
            index += i;
        }
        
        //배열 생성
        int[] answer = new int[index];
        
        int num = 0;
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            num = a;

            for (int j = num; j < num + arr[i]; j++) {
                answer[j] = arr[i];
                a++;
            }
        }
        
        
        
        return answer;
    }
}