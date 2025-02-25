class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        //배열 합 구하기
        int sum1 = 0; 
        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
        }
        
        int sum2 = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum2 += arr2[i];
        }
        
        //
        if (arr1.length > arr2.length) {
            answer = 1;
        } else if (arr1.length < arr2.length) {
            answer = -1;
        } else {
            answer = sum1 == sum2 ? 0 : sum1 > sum2 ? 1 : -1;
        }
        
        return answer;
    }
}