/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        ListNode temp = head1;
        int c1 = 0;
        while(temp != null){
            c1++;
            temp = temp.next;
        }
        
        temp = head2;
        int c2 = 0;
        while(temp != null){
            c2++;
            temp = temp.next;
        }
        
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        
        int diff = 0;
        if(c1 > c2){
            diff = c1 - c2;
            while(diff > 0){
                temp1 = temp1.next; diff--;
            }
        }
        else {
            diff = c2 - c1;
            while(diff > 0){
                temp2 = temp2.next; diff--;
            }
        }
        
        while(temp1 != null && temp2 != null){
            if(temp1 == temp2) return temp1;
            
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
    
        return null;
    }
}