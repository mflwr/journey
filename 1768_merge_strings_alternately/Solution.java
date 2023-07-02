class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int firstLength = word1.toCharArray().length;
        int secondLength = word2.toCharArray().length;
        int length = Math.max(firstLength, secondLength);

        for (int idx = 0; idx < length; idx++) {
            if (idx < firstLength) {
                sb.append(word1.charAt(idx));
            }

            if (idx < secondLength) {
                sb.append(word2.charAt(idx));
            }
        }

        return sb.toString();
    }
}