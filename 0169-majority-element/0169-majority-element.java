class Solution {
    public int majorityElement(int[] arr) {
        int c = 0;
        int e = 0;
        int n = arr.length;

        for(int i = 0; i < arr.length; i++){
            if(c == 0){
                c += 1;
                e = arr[i];
            }
            else if(arr[i] == e) c++;
            else c--;
        }

        int c1 = 0;
        for(int i : arr){
            if(i == e) c1++;
        }

        if(c1 > n/2) return e;
        return -1;
    }
}