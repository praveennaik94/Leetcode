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
        HashMap<ListNode, Integer> map = new HashMap<>();
        
        ListNode temp = head1;
        
        while(temp != null){
            map.put(temp, map.getOrDefault(temp, 0)+1);
            temp = temp.next;
        }
        
        temp = head2;
        while(temp != null){
            if(map.containsKey(temp)) return temp;
            temp = temp.next;
        }
        
        return null;
    }
}