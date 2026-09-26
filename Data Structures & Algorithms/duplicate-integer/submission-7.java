class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int n : nums) {
            if (!seen.contains(n)) {
                seen.add(n);
            } else if (seen.contains(n)) {
                return true;
            }
        }

        return false;
    }
}