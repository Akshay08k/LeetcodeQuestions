class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;

        if (digits[length - 1] == 9) {
            digits[length - 1] = 0;
            for (int i = length - 2; i >= 0; i--) {
                if (digits[i] != 9) {
                    digits[i]++;
                    return digits;
                } else {
                    digits[i] = 0;
                }
            }

            // If we're here, it means we have a carry in the most significant digit.
            int[] result = new int[length + 1];
            result[0] = 1;
            return result;
        } else {
            digits[length - 1]++;
        }

        return digits;
    }
}
