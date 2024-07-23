class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        
        int num = 0;
        //false의 개수
        for (int i = 0; i < finished.length; i++) {
            if (finished[i] == false) {
                num++;
            }
        }
        System.out.println(num);

        String[] answer = new String[num];
        int index = 0;
        for (int i = 0; i < finished.length; i++) {
            if (finished[i] == false) {
                answer[index] = todo_list[i];
                index++;
            }
        }
                
        return answer;
    }
}