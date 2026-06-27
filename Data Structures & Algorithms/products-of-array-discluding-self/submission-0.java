class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result  = new int[nums.length];

        int prefix = 1, postfix = 1;

        Arrays.fill(result, 1);

        for (int i = 1; i < nums.length; i++) {
            result[i] = nums[i - 1] * prefix;

            prefix = result[i];
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            result[i] =  (nums[i + 1] * postfix) * result[i];

            postfix = nums[i + 1] * postfix;
        }
        return result;
        
    }
}  
