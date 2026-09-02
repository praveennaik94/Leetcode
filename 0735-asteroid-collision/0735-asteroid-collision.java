class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0) stack.push(arr[i]);
            else{
                
                while(!stack.isEmpty() && stack.peek() > 0 && Math.abs(arr[i]) > stack.peek()) stack.pop();
                
                if(!stack.isEmpty() && stack.peek() == Math.abs(arr[i])) {
                    stack.pop();
                }
                else if(stack.isEmpty() || stack.peek() < 0) stack.push(arr[i]);
            }
        }

        if(stack.isEmpty()) return new int[]{};

        int[] ans = new int[stack.size()];
        int idx = 0;
        while(!stack.isEmpty()){
            ans[idx++] = stack.pop();
        }
        
        int i = 0; int j = ans.length-1;
        while(i < j){
            int temp = ans[i];
            ans[i] = ans[j];
            ans[j] = temp;
            i++; j--;
        }
        
        return ans;
    }
}