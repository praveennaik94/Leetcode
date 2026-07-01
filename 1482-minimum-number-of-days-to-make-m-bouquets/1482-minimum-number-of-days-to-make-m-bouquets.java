class Solution {
    public int minDays(int[] bloomDays, int m, int k) {
        long totalFlowers = (long) m * k;
        if (totalFlowers > bloomDays.length) return -1;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int n : bloomDays){
            if(n > max) max = n;

            if(n < min) min = n;
        }
        int l = min; int r = max;
        
        while(l <= r){
            int mid = l+(r-l)/2;
            
            if(isPossible(bloomDays, mid, m, k)) r = mid-1;
            else l = mid+1;   
        }
        return l;
    }
    public boolean isPossible(int[] bloomDays, int day, int m, int k) {
        int count = 0;  // count of consecutive bloom r = mid-1;ed flowers
        int bouquets = 0;

        for (int bloom : bloomDays) {
            if (bloom <= day) {
                count++;
                if (count == k) {
                    bouquets++;
                    count = 0;
                }
            } else count = 0;
        }
        return bouquets >= m;
    }
}