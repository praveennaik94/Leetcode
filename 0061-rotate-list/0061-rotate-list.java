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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;

        ListNode temp = head;
        int c = 1;
        while(temp.next != null){
            c++; temp = temp.next;
        }
        
        k = k % c;
        if(k == 0) return head;

        temp.next = head;
        ListNode curr = find(head, c-k);
        head = curr.next;
        curr.next = null;

        return head;
    }

    public static ListNode find(ListNode head, int k){
        ListNode temp = head;
        for(int i = 0; i < k-1; i++) temp = temp.next;

        return temp;
    }
}