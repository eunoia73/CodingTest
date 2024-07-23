class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        //분모
        int denom0 = denom1 * denom2;
        int numer0 = numer1 * denom2 + numer2 * denom1;

        for (int i = denom0; i > 1; i--) {
            if (denom0 % i == 0 && numer0 % i == 0) {
                denom0 = denom0 / i;
                numer0 = numer0 / i;
            }

        }
        answer[0] = numer0;
        answer[1] = denom0;
        
        return answer;
    }
}