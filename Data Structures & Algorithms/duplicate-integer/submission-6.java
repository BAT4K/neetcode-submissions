class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seenNumbers = new HashSet<>();

        for (int n : nums) {
            if (seenNumbers.contains(n)) {
                return true;
            }

            seenNumbers.add(n);
        }
        return false;
        
    }
}