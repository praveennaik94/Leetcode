class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder ans = new StringBuilder();
        int temp = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                if(temp == 0) temp++;
                else {
                    temp++;
                    ans.append(ch);
                }
            }
            else{
                temp--;
                if(temp == 0) continue;
                else ans.append(ch);
            }
        }
        return ans.toString();
    }
}