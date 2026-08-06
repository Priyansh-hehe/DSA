class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total_sum = 0;
        int cur = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            cur = Math.max(cur+nums[i],nums[i]);
            max = Math.max(max,cur);
            total_sum += nums[i];
        }
        cur = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++) {
            cur = Math.min(cur+nums[i],nums[i]);
            min = Math.min(min,cur);
        }
        if(total_sum==min){
            return max;
        }
        return Math.max(max,(total_sum-min));
        
    }
}