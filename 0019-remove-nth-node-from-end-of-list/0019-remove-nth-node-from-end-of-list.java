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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || (n == 1 && head.next == null)) return null;

        ListNode temp = head;
        int c = 0;
        while(temp != null){
            c++;
            temp = temp.next;
        }

        if(n > c) return head;
        if(c == n) return head.next;

        temp = head;
        for(int i = 1; i < c-n; i++) temp = temp.next;
        if(temp.next == null) return head;
        
        temp.next = temp.next.next;

        return head;
    }
}