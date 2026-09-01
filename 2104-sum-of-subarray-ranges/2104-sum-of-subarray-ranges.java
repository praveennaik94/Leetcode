class Solution {
    public long subArrayRanges(int[] arr) {
        long sum = 0;
        
        for(int i = 0; i < arr.length; i++){
            
            long min = Integer.MAX_VALUE;
            long max = Integer.MIN_VALUE;
            
            for(int j = i; j < arr.length; j++){
                min = Math.min(arr[j], min);
                max = Math.max(arr[j], max);
                
                sum += max - min;
            }
        }
        
        return sum;
    }
}