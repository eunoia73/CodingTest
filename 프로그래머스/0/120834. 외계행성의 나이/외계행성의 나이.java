class Solution {
    public String solution(int age) {
        String answer = "";
        char[] age_arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] odd = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

        char[] age_re = String.valueOf(age).toCharArray();
        for (int i = 0; i < age_re.length; i++) {
            for (int j = 0; j < age_arr.length; j++) {
                if (age_re[i] == age_arr[j]) {
                    answer += odd[j];
                }
            }
        }
        return answer;
    }
}