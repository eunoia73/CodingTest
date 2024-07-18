class Solution {
    public int solution(int n) {
        int answer = 0;
        double sqrted = Math.sqrt(n);
        answer = (int) (sqrted * 10.0) % 10 == 0 ? 1 : 2;
        return answer;
    }
}