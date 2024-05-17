class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        for(int i = 0; i<arr.length; i++){
            if(97 <= arr[i] && arr[i] <=122){
                arr[i] -= 32;
                answer += arr[i];
            }else{
                arr[i] += 32;
                answer += arr[i];
            }
            
        }

        return answer;
    }
}