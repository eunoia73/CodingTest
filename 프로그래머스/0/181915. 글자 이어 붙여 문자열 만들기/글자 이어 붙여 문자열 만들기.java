class Solution {
    public String solution(String my_string, int[] index_list) {
        //char 배열로 만들기
        char[] my_string_char = my_string.toCharArray();
        
        //StringBuilder로 합치기
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<index_list.length; i++){
            sb.append(my_string_char[index_list[i]]);
        }
        return sb.toString();
    }
}