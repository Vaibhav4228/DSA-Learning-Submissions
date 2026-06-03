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
     // ok we need to remove head also so we use dummy pointer here
     ListNode dummy = new ListNode(-1);
     dummy.next = head;

     ListNode fast = dummy, slow = dummy;

     //we need to run fast with n step
     for(int i = 0; i<n; i++){
        fast = fast.next;
     }

     while(fast.next != null){
        fast = fast.next;
        slow = slow.next;
     }

     // now skiping target node
     slow.next = slow.next.next;


     return dummy.next;


    }
}
