class Solution {
    public int[] replaceElements(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int max = -1;
            for (int j = i + 1; j < nums.length; j++) {
                max = Math.max(max, nums[j]);
            }
            ans[i] = max;
        }

        // Return the leaders 
        return ans;
    }
}