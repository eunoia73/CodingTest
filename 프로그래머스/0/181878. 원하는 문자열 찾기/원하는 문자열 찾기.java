class Solution {
    public int solution(String myString, String pat) {
        
       return myString.toLowerCase().contains(pat.toLowerCase())==true? 1:0;
    }
}