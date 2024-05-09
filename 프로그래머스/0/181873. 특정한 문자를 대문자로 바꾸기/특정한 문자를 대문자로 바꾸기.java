class Solution {
    public String solution(String my_string, String alp) {
        String changed = alp.toUpperCase();
        return my_string.replace(alp, changed);
    }
}