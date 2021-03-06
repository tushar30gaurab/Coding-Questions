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


// Iterative Approach
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode head = new ListNode(0);
        
        ListNode junction = head;
        
        while(list1!=null && list2!=null){
            
            if(list1.val <= list2.val){
                junction.next = list1;
                list1 = list1.next;
            }
            else if(list1.val > list2.val){
                junction.next = list2;
                list2 = list2.next;
            }
            
            junction = junction.next;
        }
        
        if(list1!=null){
            junction.next = list1;
        }
        if(list2!=null){
            junction.next = list2;
        }
        
        return head.next;
    }
}



// Recursive approach
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        
        if(list1.val <= list2.val){
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }
        
        else{
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}
