class Solution {
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr) set.add(i);

        int max = 0;
        for(int i : set){
            if(!set.contains(i-1)){
                int n = i;
                int c = 1;
                while(set.contains(n+1)){
                    c++; n += 1;
                }
                max = Math.max(max, c);
            }
            
        }

        return max;
    }
}