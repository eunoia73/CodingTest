class Solution {
    public int solution(int order) {
        int answer = 0;
         String st_order = order + "";

        for (int i = 0; i < st_order.length(); i++) {
            if (st_order.charAt(i) == '3' || st_order.charAt(i) == '6' || st_order.charAt(i) == '9'){
                answer++;
            }
        }
        return answer;
    }
}