class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 1 || nums.length == 0) {
            return nums.length;
        }

        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        int ans = 0;

        for (int num : set) {
            if (set.contains(num - 1)) {
                continue;
            }

            int curNumber = num;
            int curMax = 1;

            while (set.contains(curNumber + 1)) {
                curNumber++;
                curMax++;
            }
            ans =  Math.max(ans, curMax);
        }
        return ans;
        
    }
}
