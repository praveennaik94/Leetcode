class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        int n = arr.length;

        for(int i = 2 * arr.length-1; i >= 0; i--){

            while(!stack.isEmpty() && stack.peek() <= arr[i%n]) stack.pop();

            if(i < n) ans[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(arr[i%n]);
        }
        return ans;
    }
}