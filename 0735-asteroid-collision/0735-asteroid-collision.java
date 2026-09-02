class Solution {
    public int[] asteroidCollision(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>(); 
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0) list.add(arr[i]);
            else{
                
                while(!list.isEmpty() && list.get(list.size() -1 ) > 0 && Math.abs(arr[i]) > list.get(list.size() -1 )) list.remove(list.size()-1);
                
                if(!list.isEmpty() && list.get(list.size()-1) == Math.abs(arr[i])) {
                    list.remove(list.size()-1);
                }
                else if(list.isEmpty() || list.get(list.size()-1) < 0) list.add(arr[i]);
            }
        }

        if(list.isEmpty()) return new int[]{};

        int[] ans = new int[list.size()];
        for(int i = 0; i < ans.length; i++) ans[i] = list.get(i);
        
        return ans;
    }
}