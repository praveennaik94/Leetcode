/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return false;
        if(head.next == null) return true;
        if(head.next.next == null){
            if(head.val != head.next.val) return false;
            return true;
        }

        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;

        while(temp != null){
            stack.push(temp.val);
            temp = temp.next;
        }

        temp = head;
        while(temp != null){
            if(stack.peek() != temp.val) return false;
            stack.pop(); temp = temp.next;
        }

        return true;
    }
}