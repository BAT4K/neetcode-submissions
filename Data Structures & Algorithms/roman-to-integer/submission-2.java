class Solution {
    static Map<String, Integer> roman = new HashMap<>();

    static {
        roman.put("I", 1);
        roman.put("V", 5);
        roman.put("X", 10);
        roman.put("L", 50);
        roman.put("C", 100);
        roman.put("D", 500);
        roman.put("M", 1000);
        roman.put("IV", 4);
        roman.put("IX", 9);
        roman.put("XL", 40);
        roman.put("XC", 90);
        roman.put("CD", 400);
        roman.put("CM", 900);
    }
    public int romanToInt(String s) {
        int sum = 0;
        int i = 0;

        while (i < s.length()) {
            if (i < s.length() - 1) {
                if (roman.containsKey(s.substring(i, i + 2))) {
                sum += roman.get(s.substring(i, i + 2));
                i += 2;
                continue;
                }
            }
                sum += roman.get(s.substring(i, i + 1));
                i += 1;
        }
            return sum;
    }
}
