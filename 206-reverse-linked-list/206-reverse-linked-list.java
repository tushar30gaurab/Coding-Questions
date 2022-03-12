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
        
        if(head == null || head.next==null){
            return head;
        }
        
        ListNode ptr1 = null;
        ListNode ptr2 = head;
        ListNode ptr3 = head.next;
        
        
        while(ptr3!=null){
            ptr2.next = ptr1;
            ptr1 = ptr2;
            ptr2 = ptr3;
            ptr3 = ptr3.next;
        }
        ptr2.next = ptr1;
        head = ptr2;
        return head;
    }
}