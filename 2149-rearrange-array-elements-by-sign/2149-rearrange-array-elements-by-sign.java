class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0) pos.add(nums[i]);
            else neg.add(nums[i]);
        }
        int idx = 0;
        for(int i = 0; i < nums.length; i+=2){
            nums[i] = pos.get(idx++);
        }

        idx = 0;
        for(int i = 1; i < nums.length; i+=2){
            nums[i] = neg.get(idx++);
        }

        return nums;
    }
}