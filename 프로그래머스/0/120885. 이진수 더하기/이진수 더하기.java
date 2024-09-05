class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int i = Integer.parseInt(bin1, 2);
        int j = Integer.parseInt(bin2, 2);
        answer = Integer.toBinaryString(i + j);
        
        return answer;
    }
}