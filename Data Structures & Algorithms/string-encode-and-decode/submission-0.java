class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

        for (String str : strs) {
            encoded.append(str.length())
                   .append('#')
                   .append(str);
        }

        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int separatorIndex = i;

            // Find the # separating the length from the string
            while (str.charAt(separatorIndex) != '#') {
                separatorIndex++;
            }

            int length = Integer.parseInt(
                str.substring(i, separatorIndex)
            );

            int stringStart = separatorIndex + 1;
            int stringEnd = stringStart + length;

            result.add(str.substring(stringStart, stringEnd));

            i = stringEnd;
        }

        return result;
    }
}
