class Solution {
    public long solution(long n) {
        double a = Math.sqrt(n);
        long answer = a % 1 == 0.0 ? (long) ((a + 1) * (a + 1)) : -1;
        return answer;
    }
}