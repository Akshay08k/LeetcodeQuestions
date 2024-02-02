public class Solution{
public char repeatedCharacter(String s) {
        Map<Character, Integer> lastSeenIndex = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentLetter = s.charAt(i);

            if (lastSeenIndex.containsKey(currentLetter)) {
                return currentLetter;
            }

            lastSeenIndex.put(currentLetter, i);
        }

        throw new IllegalArgumentException("The input string must contain at least one repeated character.");
    }
    }