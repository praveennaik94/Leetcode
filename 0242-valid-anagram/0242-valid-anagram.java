class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            char ch1 = t.charAt(i);

            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
            map2.put(ch1, map2.getOrDefault(ch1, 0) + 1);
        }

        for(char ch : map1.keySet()){
            if(!map2.containsKey(ch)) return false;

            int a = map1.get(ch);
            int b = map2.get(ch);

            if(a != b) return false;
        }
        return true;
    }
}