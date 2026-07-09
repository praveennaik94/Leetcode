class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int n = arr1.length+arr2.length;
        
        int ans[] = new int[n];
        
        int i = 0;
        int j = 0;
        int idx = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                ans[idx] = arr1[i];
                idx++; i++;
            }else{
                ans[idx] = arr2[j];
                idx++;j++; 
            }
        }
        
        while(i < arr1.length){
            ans[idx] = arr1[i];
            idx++; i++;
        }
        
        while(j < arr2.length){
            ans[idx] = arr2[j];
            idx++; j++;
        }
        
        if(n % 2 == 0)
            return (double) (ans[(n/2)-1] + ans[n/2])/2;
        
        return (double) ans[n/2];
    }
}