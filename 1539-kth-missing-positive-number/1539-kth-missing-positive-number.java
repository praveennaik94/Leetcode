class Solution {
    public int findKthPositive(int[] vec, int k) {
       int low = 0, high = vec.length - 1;

        // Binary search loop
        while (low <= high) {
            int mid = (low + high) / 2;

            // Number of missing elements before index mid
            int missing = vec[mid] - (mid + 1);

            if (missing < k) {
                low = mid + 1;  // Move right
            } else {
                high = mid - 1; // Move left
            }
        }

        // Final result after binary search
        return k + high + 1;
    }
}