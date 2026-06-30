class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();

        for (int n: nums) {
            set.add(n);
        }

        int longestSequence = 1;

        for (int n: nums) {
            if (set.contains(n-1)) {
                continue;
            } else {
                int curSequence = 1;
                int curNumber = n;
                while (set.contains(curNumber + 1)) {
                    curSequence++;
                    curNumber++;
                }
                longestSequence = Math.max(longestSequence, curSequence);
            }
        }
        return longestSequence;
        
    }
}
