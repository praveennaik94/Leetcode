class Solution {
    public void rotate(int[] arr, int k) {

        k = k % arr.length;

        if(arr.length < k) return;

        reverse(arr, 0 , arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        
    }

    public static void reverse(int arr[], int st, int end){
        if(st == end) return;

        while(st < end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
}