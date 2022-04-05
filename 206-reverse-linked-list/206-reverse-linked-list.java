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
    public ListNode reverseList(ListNode head) {
        return reverseList(head, null);
    }
    
    public ListNode reverseList(ListNode head, ListNode prev){
        if(head == null)
            return prev;
        
        ListNode nnext = head.next;
        head.next = prev;
        prev = head;
        head = nnext;
        
        return reverseList(head, prev);
    }
}