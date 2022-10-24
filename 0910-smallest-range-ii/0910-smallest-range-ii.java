class Solution {
    public int smallestRangeII(int[] nums, int k) {
        //find min and max in int[] nums, score = max-min+2k
        //find smallest score
        //Compare the orignal one and choose the
        
        Arrays.sort(nums);
        int result = nums[nums.length-1] - nums[0];
        
        for(int i = 0; i < nums.length-1; i++){
            int high = Math.max(nums[nums.length-1] - k, nums[i] + k);
            int low = Math.min(nums[0] + k, nums[i+1] - k);
            result = Math.min(result, high - low);
        }
        
        return result;
        
            
            
    }
}