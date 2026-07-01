class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }
        int l = 1;
        int r = max;

        while(l <= r){
            int mid = l+(r-l)/2;
            long hour = hours(arr, mid);
            if(hour <= h) r = mid-1;
            else l = mid+1;
        }
        return l;
    }

    public static long hours(int arr[], int h){
        long c = 0;
        for(int n : arr){
            c += n / h;
            if(n % h != 0) c++;
        }
        return c;
    }
}