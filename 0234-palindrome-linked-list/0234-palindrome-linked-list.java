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

        ListNode first = head;
        
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode newHead = reverse(slow.next);
        ListNode second = newHead;
        
        while(second != null){
            if(first.val != second.val) return false;
            first = first.next; second = second.next;
        }
        return true;
    }
    public static ListNode reverse(ListNode head){
        
        ListNode temp = head;
        ListNode prev = null;
        ListNode nextNode = null;
        
        while(temp != null){
            nextNode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextNode;
        }
        return prev;
    }
}