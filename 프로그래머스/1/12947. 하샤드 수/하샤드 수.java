class Solution {
    public boolean solution(int x) {
        int x1 = x;
        
        //자릿수의 합
        int a = 0;
        while (x1 >= 1) {
            a += x1 % 10;
            x1 = x1 / 10;
        }

        boolean answer = x % a == 0 ? true : false;
        return answer;
    }
}