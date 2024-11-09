import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int result = 0;
        Arrays.sort(array);
        int[] nums = new int[array[array.length - 1] + 1];
        for (int i = 0; i < array.length; i++) {
            nums[array[i]]++;
        }

         int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                result = i;
            } else if (nums[i] == max) {
                result = -1;
            }
        }
        
        return result;
    }
}