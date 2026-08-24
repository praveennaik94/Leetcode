class Solution {
    public void rotate(int[] arr, int k) {
    int n = arr.length;

    if(n <= 1) return;

    k = k % n;

    swap(arr, 0, n - k - 1);
    swap(arr, n - k, n - 1);
    swap(arr, 0, n - 1);
}

public static void swap(int[] arr, int i, int j) {

    while(i < j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        i++;
        j--;
    }
}
}