class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        int symbolIdx = 0;
        while (symbolIdx < first.length() && symbolIdx < last.length()) {
            if (first.charAt(symbolIdx) == last.charAt(symbolIdx)) {
                symbolIdx++;
            } else {
                break;
            }
        }

        return first.substring(0, symbolIdx);
    }
}