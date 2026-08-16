class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) { // checks if String s and t have same length
            return false;
        }

        int[] count = new int[26]; // creates an array for alphabet

        for (int i = 0; i < s.length(); i++) { // 
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int frequency : count) {
            if (frequency != 0) {
                return false;
            }
        }

        return true;
    }
}