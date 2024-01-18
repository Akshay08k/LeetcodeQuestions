class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0; // Initialize a count to keep track of valid elements

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i]; // Move valid elements to the front of the array
            }
        }

        return count; // Return the new length of the array without the specified value
    }
}
