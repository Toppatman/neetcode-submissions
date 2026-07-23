class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String word : strs) {
            int[] count = new int[26];

            for (char c : word.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder keyBuilder = new StringBuilder();

            for (int frequency : count) {
                keyBuilder.append('#').append(frequency);
            }

            String key = keyBuilder.toString();

            groups
                .computeIfAbsent(key, k -> new ArrayList<>())
                .add(word);
        }

        return new ArrayList<>(groups.values());
    }
}
