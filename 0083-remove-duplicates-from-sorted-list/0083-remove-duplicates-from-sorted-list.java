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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode temp = head.next;
        ListNode curr = head;
        
        while(temp != null){
            if(temp.val != curr.val){
                curr.next = temp;
                curr = temp;
            }
            temp = temp.next;
        }
        
        curr.next = null;
        
        return head;
    }
}