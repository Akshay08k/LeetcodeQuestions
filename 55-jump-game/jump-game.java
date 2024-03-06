class Solution {
    public boolean canJump(int[] nums) {
        int Target = 0;
        for(int i=0;i<nums.length;i++){
            if(i > Target)
              return false;
            Target = Math.max(Target,i + nums[i]);
        }
        return true;
    }
}