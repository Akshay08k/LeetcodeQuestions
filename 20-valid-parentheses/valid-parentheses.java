import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        // Create a stack to store opening brackets
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // Check for opening brackets and push onto the stack
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
            } else {
                // Check for closing brackets and match with the top of the stack
                if (stack.isEmpty()) {
                    return false;  // No matching opening bracket
                }

                char top = stack.pop();

                // Validate the matching of opening and closing brackets
                if ((currentChar == ')' && top != '(') ||
                    (currentChar == '}' && top != '{') ||
                    (currentChar == ']' && top != '[')) {
                    return false;  // Mismatched closing bracket
                }
            }
        }

        // After processing the entire string, the stack should be empty if valid
        return stack.isEmpty();
    }
}
