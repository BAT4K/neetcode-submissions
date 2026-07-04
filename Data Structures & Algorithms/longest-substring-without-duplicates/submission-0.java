class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        if (s.length() == 1) {
            return 1;
        }

        Set<Character> set = new HashSet();

        int left = 0;
        int right = 0;
        int ans = 0;

        while (right < s.length()) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            

            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
        
    }
}
