class Solution {
    public int[] solution(int n, int[] numlist) {
         int index = 0;
        //n배수인건 몇 개?
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                index++;
            }
        }
        int[] answer = new int[index];

        int index2 = 0;
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                answer[index2++] = numlist[i];
            }
        }
        
        return answer;
    }
}