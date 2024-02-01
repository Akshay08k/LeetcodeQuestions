public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Take the first string as the reference
        String reference = strs[0];

        for (int i = 0; i < reference.length(); i++) {
            char currentChar = reference.charAt(i);

            // Check if the character is common in all strings
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    // If not, return the prefix found so far
                    return reference.substring(0, i);
                }
            }
        }

        // If the loop completes, the entire reference string is the common prefix
        return reference;
    }
}
