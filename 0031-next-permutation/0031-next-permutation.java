class Solution {
    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int idx = -1;

        for(int i = n-2; i >= 0; i--){
            if(arr[i] < arr[i+1]){
                idx = i; break;
            }
        }

        if(idx == -1){
            int i = 0; int j = n-1;
            while(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++; j--;
            }
            return;
        }

        for(int i = n-1; i > idx; i--){
            if(arr[i] > arr[idx]){
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                break;
            }
        }

        int i = idx+1; int j = n-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
        
    }
}