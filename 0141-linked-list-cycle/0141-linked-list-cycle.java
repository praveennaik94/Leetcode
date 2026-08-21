/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        
        ListNode temp = head;
        HashMap<ListNode, Integer> map = new HashMap<>();
        
        while(temp != null){
            
            if(map.containsKey(temp)) return true;
            
            map.put(temp, map.getOrDefault(temp, 0)+1);
            
            temp = temp.next;
        }
        if(temp == null) return false;
        
        return false;
    }
}