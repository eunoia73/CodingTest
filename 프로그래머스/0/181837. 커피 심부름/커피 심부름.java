class Solution {
    public int solution(String[] order) {
        int answer = 0;
        //아메리카노 4500, 라떼 5000
        for (int i = 0; i < order.length; i++) {
            if (order[i].contains("americano") || order[i].contains("anything")) {
                answer += 4500;
            } else {
                answer += 5000;
            }
        }
        return answer;
    }
}