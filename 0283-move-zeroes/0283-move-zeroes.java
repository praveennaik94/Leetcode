class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        
        int ans[] = new int[n];
        int idx = 0;
        
        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                ans[idx] = arr[i];
                idx++;
            }
        }
        
        if(idx == n) return;
        
        for(int i = idx; i < n; i++){
            ans[i] = 0;
        }
        
        for(int i = 0; i < ans.length; i++){
            arr[i] = ans[i];
        }
    }
}