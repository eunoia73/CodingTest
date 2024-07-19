class Solution {
    public String[] solution(String[] names) {
        int num = names.length % 5 == 0 ? names.length / 5 : names.length / 5 + 1;

        String[] answer = new String[num];
        
        int n = 0;
        
        //0,5,10
        for(int i = 0; i < names.length; i++){
            if(i % 5 == 0){
                answer[n] = names[i];
                n++;
            }
        }
        
        return answer;
    }
}