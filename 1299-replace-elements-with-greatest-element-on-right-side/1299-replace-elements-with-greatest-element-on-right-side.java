class Solution {
    public int[] replaceElements(int[] nums) {
        int[] ans = new int[nums.length];
        int max = -1;
        int n = nums.length;

        for(int i = n-1; i >= 0; i--){
            if(nums[i] > max){
                ans[i] = max;
                max = nums[i];
            }
            else ans[i] = max;
        }

        return ans;
    }
}