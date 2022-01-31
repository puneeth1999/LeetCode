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
    public ListNode swapPairs(ListNode head) {
        if(head ==  null) return head;
        ListNode curr = head.next, prev = head;
        while(curr != null){
            // swap
            int temp = curr.val;
            curr.val = prev.val;
            prev.val = temp;
            
            // Iteration rules
            prev = curr.next;
            if(prev != null){
                curr = prev.next;
            } else{
                curr = prev;
            }
        }
        return head;
    }
}