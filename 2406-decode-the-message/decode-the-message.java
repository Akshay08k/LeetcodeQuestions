class Solution {
  public String decodeMessage(String key, String message) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Map<Character, Character> keySubstitution = new HashMap<>();

        int index = 0;
        for (char c : key.toCharArray()) {
            if (c != ' ' && !keySubstitution.containsKey(c)) {
                keySubstitution.put(c, alphabet.charAt(index));
                index++;
            }
        }

        StringBuilder decodedMessage = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (c == ' ') {
                decodedMessage.append(' ');
            } else {
                decodedMessage.append(keySubstitution.getOrDefault(c, c));
            }
        }

        return decodedMessage.toString();
    }
}