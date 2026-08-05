class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int max = Integer.MIN_VALUE;
        String ans = "";
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                String s1 = s.substring(i, j+1);
                if(palindrome(s1) && max < s1.length()){
                    max = s1.length();
                    ans = s1;
                }
            }
        }
        return ans;
    }
    public static boolean palindrome(String s1){
        int k = 0; int m = s1.length()-1;
        if(k == m) return true;
        while(k <= m){
            if(s1.charAt(k) != s1.charAt(m)) return false;
            k++;
            m--;
        }
        return true;
    }
}