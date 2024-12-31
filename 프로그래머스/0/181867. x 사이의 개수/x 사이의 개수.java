import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String myString) {
        String[] mid = myString.split("x");


        List<Integer> answer = new ArrayList<>();
//        if (myString.charAt(0) == 'x') {
//            answer.add(0);
//        }
        for (int i = 0; i < mid.length; i++) {
            answer.add(mid[i].length());

        }
        if(myString.charAt(myString.length() - 1) == 'x') answer.add(0);

        //배열로
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }        
        return result;
    }
}