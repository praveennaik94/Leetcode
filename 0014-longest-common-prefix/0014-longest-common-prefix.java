class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int len = strs.length;

        StringBuilder ans = new StringBuilder();

        char[] first = strs[0].toCharArray();
        char[] last = strs[len-1].toCharArray();

        for(int i = 0; i < first.length; i++){
            if(first[i] != last[i]) break;
            ans.append(first[i]);
        }

        return ans.toString();
    }
}