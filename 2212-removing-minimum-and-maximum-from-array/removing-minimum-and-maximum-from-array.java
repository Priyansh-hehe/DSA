class Solution {
    public int minimumDeletions(int[] nums) {

        int max = 0;
        int min = 0;
        int n = nums.length;

        // Find indices of maximum and minimum elements
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[max]) {
                max = i;
            }
            if (nums[i] < nums[min]) {
                min = i;
            }
        }

        // Option 1: Remove both from the front
        int front = Math.max(max, min) + 1;

        // Option 2: Remove both from the back
        int back = n - Math.min(max, min);

        // Option 3: Remove one from front and one from back
        int frontBack = Math.min(max, min) + 1 + (n - Math.max(max, min));

        return Math.min(front, Math.min(back, frontBack));
    }
}