class Solution {
    public void rotate(int[] arr, int k) {

        k = k % arr.length;

        swap(arr, 0, arr.length-1);
        swap(arr, 0, k-1);
        swap(arr, k, arr.length-1);
        
    }

    public static void swap(int arr[], int a, int b){
        if(a == b) return;

        while(a <= b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }
}