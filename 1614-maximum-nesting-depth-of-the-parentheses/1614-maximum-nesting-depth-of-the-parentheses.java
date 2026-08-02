class Solution {
    public int maxDepth(String s) {

        int temp = 0;
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                temp++;
                max = Math.max(max, temp);
            }
            else if(ch == ')') temp--;
        }

        return max;
    }
}