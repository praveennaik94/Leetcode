class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int temp = 0;
        int max = 0;

        for(int i : nums){
            if(i == 1){
                temp += 1;
                max = Math.max(max, temp);
            } 
            else temp = 0;
        }

        return max;
    }
}