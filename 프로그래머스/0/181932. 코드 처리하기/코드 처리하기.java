class Solution {
    public String solution(String code) {
        
         int mode = 0;
        String ret = "";
        char[] code_arr = code.toCharArray();

        for (int idx = 0; idx < code_arr.length; idx++) {

            if (mode == 0) {
                if (code_arr[idx] == '1') {
                    mode = 1;
                } else {
                    if (idx % 2 == 0) {
                        ret += code_arr[idx];
                    }
                }
            } else if (mode == 1) {
                if (code_arr[idx] == '1') {
                    mode = 0;
                } else {
                    if (idx % 2 != 0) {
                        ret += code_arr[idx];
                    }
                }
            }

        }


        if (ret.length() == 0) {
            ret = "EMPTY";
        }

        return ret;
    }
}