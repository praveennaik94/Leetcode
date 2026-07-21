class Solution {
    public int[] twoSum(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            int n = k - arr[i];
            
            if(map.containsKey(n)) return new int[]{map.get(n), i};
            
            map.put(arr[i], i);
        }
        return new int[]{-1,-1};
    }
}