import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstUniqChar(String s) {
        // Create a HashMap to store character frequencies
        Map<Character, Integer> charCount = new HashMap<>();

        // Count the frequency of each character in the string
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Iterate through the string to find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        // If no unique character is found, return -1
        return -1;
    }
}
