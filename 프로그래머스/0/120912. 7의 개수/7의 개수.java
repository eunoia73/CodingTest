class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String arr = "";
        for (int i = 0; i < array.length; i++) {
            arr += (array[i] + "");
        }

        for(int i = 0; i<arr.length(); i++){
            if(arr.charAt(i) == '7') answer++;
        }
        return answer;
    }
}