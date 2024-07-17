import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String num = "";
        for (int i = 0; i < my_string.length(); i++) {
            if('0' <= my_string.charAt(i) && my_string.charAt(i) <= '9' )
                num += my_string.charAt(i);
        }
        System.out.println(num);

        //int 배열로
        char[] result = num.toCharArray();
        int[] answer = new int[result.length];
        for(int i = 0; i<result.length; i++){
        answer[i] = Integer.parseInt(String.valueOf(result[i]));

        }        
         Arrays.sort(answer);

        return answer;
    }
}