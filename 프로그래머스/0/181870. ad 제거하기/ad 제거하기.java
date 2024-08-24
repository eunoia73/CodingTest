import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] strArr) {
        //List에 넣기
        List<String> str_list = new ArrayList<>();
        for (String s : strArr) {
            str_list.add(s);
        }

        //"ad"들어간 문자열 지우기
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].contains("ad")) {
                str_list.remove(strArr[i]);
            }
        }

        //배열로 변경하기
        String[] answer = new String[str_list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = str_list.get(i);
        }
        
        return answer;
    }
}