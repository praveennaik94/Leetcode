class Solution {
    public boolean isPerfectSquare(int n) {
        // if (n == 0 || n == 1) return n;

        int l = 1, r = n;

        while (l <= r) {

            int mid = l + (r - l) / 2;
            long square = (long) mid * mid;

            if (square == n)
                return true;

            if (square < n) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return false;
    }
}