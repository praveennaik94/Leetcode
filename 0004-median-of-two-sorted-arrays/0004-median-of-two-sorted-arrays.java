class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int n = arr1.length + arr2.length;
        
        int idx1 = n / 2;
        int idx2 = n / 2 - 1;
        
        int ele1 = -1;
        int ele2 = -1;
        
        int i = 0;
        int j = 0;
        int count = 0;
        
        while (i < arr1.length && j < arr2.length) {
        
            if (arr1[i] <= arr2[j]) {
                if (count == idx1) ele1 = arr1[i];
                if (count == idx2) ele2 = arr1[i];
                count++;
                i++;
            } else {
                if (count == idx1) ele1 = arr2[j];
                if (count == idx2) ele2 = arr2[j];
                count++;
                j++;
            }
        }
        
        while (i < arr1.length) {
            if (count == idx1) ele1 = arr1[i];
            if (count == idx2) ele2 = arr1[i];
            count++;
            i++;
        }
        
        while (j < arr2.length) {
            if (count == idx1) ele1 = arr2[j];
            if (count == idx2) ele2 = arr2[j];
            count++;
            j++;
        }
        
        if (n % 2 == 0) {
            return (ele1 + ele2) / 2.0;
        } 

        return ele1;
    }
}