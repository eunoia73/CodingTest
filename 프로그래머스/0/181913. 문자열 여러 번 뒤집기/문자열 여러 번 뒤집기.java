class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        for(int i = 0; i<queries.length; i++){
            String before = my_string.substring(0, queries[i][0]);
            String after = my_string.substring(queries[i][1]+1, my_string.length() );
            String change = my_string.substring(queries[i][0], queries[i][1]+1);
            
             StringBuilder sb = new StringBuilder();
            sb.append(change);
            sb.reverse();
            String changed = sb.toString();
            
            my_string = before + changed + after;
            
            
        }
        answer = my_string;
        
        
        return answer;
    }
}