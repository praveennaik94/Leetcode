class Solution {
    public int splitArray(int[] arr, int m) {
        if (m > arr.length)
            return -1;

        long low = 0;
        long high = 0;

        for (int page : arr) {
            low = Math.max(low, page);
            high += page;
        }

        while (low <= high) {
            long mid = low + (high - low) / 2;

            int students = countStudents(arr, mid);

            if (students > m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return (int) low;
    }

    private int countStudents(int[] arr, long pages) {
        int students = 1;
        long pagesStudent = 0;

        for (int page : arr) {
            if (pagesStudent + page <= pages) {
                pagesStudent += page;
            } else {
                students++;
                pagesStudent = page;
            }
        }

        return students;
    }
}