class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        
        int sum = 0;
        for(int i : arr) sum += i;
        
        int len = n*(n+1)/2;
        
        return len - sum;
    }
}