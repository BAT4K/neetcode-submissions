class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char x = t.charAt(i);
            count[c - 'a']++;
            count[x - 'a']--;
        }

        for (int n : count) {
            if (n != 0) {
                return false;
            }
        }

        return true;

    }
}
