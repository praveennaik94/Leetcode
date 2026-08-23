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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        
        ListNode temp = head;
        ListNode nextNode = null;
        ListNode prev = null;
        
        while(temp != null){
            ListNode kthNodeVar = kthNode(temp, k);
            if(kthNodeVar == null){
                if(prev != null) prev.next = temp;
                break;
            }
            
            nextNode = kthNodeVar.next;
            kthNodeVar.next = null;
            
            reverse(temp);
            
            if(temp == head) head = kthNodeVar;
            else prev.next = kthNodeVar;
            
            prev = temp;
            temp = nextNode;
        }
        
        return head;
        
    }
    public static ListNode kthNode(ListNode head, int k){
        ListNode temp = head;
        for(int i = 0; i < k-1; i++){
            temp = temp.next;
            if(temp == null) return temp;
        }
        return temp;
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