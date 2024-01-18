class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0) && dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(char[][] board, String word, int i, int j, int index) {
        if (index == word.length()) {
            return true; // All characters in the word have been found
        }

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false; // Out of bounds or current cell does not match the word
        }

        char temp = board[i][j];
        board[i][j] = ' '; // Mark the current cell as visited

        // Explore in all four directions
        boolean result = dfs(board, word, i + 1, j, index + 1)
                        || dfs(board, word, i - 1, j, index + 1)
                        || dfs(board, word, i, j + 1, index + 1)
                        || dfs(board, word, i, j - 1, index + 1);

        board[i][j] = temp; // Restore the original value

        return result;
    }
}
