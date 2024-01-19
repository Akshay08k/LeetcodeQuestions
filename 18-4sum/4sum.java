class Solution {
     public List<List<Integer>> twoSum(int[] nums,int si, int ei, long target){
         List<List<Integer>> res = new ArrayList<>();
         int left = si; 
         int right = ei;
         while(left < right){
             if(left != si && nums[left] == nums[left - 1]){
                 left++;
                 continue;
             }
             int sum = nums[left] + nums[right];
             if(sum == target){
                 List<Integer> list = new ArrayList<>();
                 list.add(nums[left]);
                 list.add(nums[right]);
                 res.add(list);
                 right--;
                 left++;
             }
             else if(sum < target){
                 left++;
             }
             else{
                 right--;
             }
         }
         return res;
    }
    
    public List<List<Integer>> threeSum(int[] nums, int start ,long target){
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        if(n - start < 3) return res;

        for(int i = start; i <= n - 3; i++){
            if(i != start && nums[i] == nums[i - 1]){
                continue;
            }
            int val1 = nums[i];
		
            List<List<Integer>> list = twoSum(nums,i + 1,n - 1,(long)target - val1);
            for(List<Integer> temp : list){
                temp.add(val1);
                res.add(temp);
            }
        }
       return res;
    }
    
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        if(n < 4) return res;
        
        Arrays.sort(nums);
        
        for(int i = 0; i <= n - 4; i++){
            if(i != 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int val1 = nums[i];
			
            List<List<Integer>> list = threeSum(nums,i + 1,(long)target - val1);
            for(List<Integer> temp : list){
                temp.add(val1);
                res.add(temp);
            }
        }
        return res;
    }
}