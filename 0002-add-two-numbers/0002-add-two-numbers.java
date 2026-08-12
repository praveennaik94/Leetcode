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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode temp1 = l1;
        ListNode temp2 = l2;

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while(temp1 != null && temp2 != null){
            int ans = temp1.val + temp2.val + carry;
            int r = ans % 10;
            ListNode temp = new ListNode(r);
            curr.next = temp;
            curr = temp;
            carry = ans / 10;
            temp1 = temp1.next; temp2 = temp2.next;
        }

        while(temp1 != null){
            int ans = temp1.val + carry;
            int r = ans % 10;
            ListNode temp = new ListNode(r);
            curr.next = temp;
            curr = temp;
            carry = ans / 10;
            temp1 = temp1.next;
        }
        while(temp2 != null){
            int ans = temp2.val + carry;
            int r = ans % 10;
            ListNode temp = new ListNode(r);
            curr.next = temp;
            curr = temp;
            carry = ans / 10;
            temp2 = temp2.next;
        }
        if(carry > 0){
            ListNode temp = new ListNode(carry);
            curr.next = temp;
        }

        return dummy.next;
    }
}