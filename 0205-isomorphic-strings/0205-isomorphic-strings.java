class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()) return false;

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            char ch1 = t.charAt(i);

            if(map1.containsKey(ch) && map1.get(ch) != ch1) return false;
            if(map2.containsKey(ch1) && map2.get(ch1) != ch) return false;

            map1.put(ch, ch1);
            map2.put(ch1, ch);
        }

        return true; 
    }
}