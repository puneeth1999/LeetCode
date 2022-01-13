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
        int counter = 1;
        ListNode curr = head;
        while(curr.next != null){
            counter++;
            curr = curr.next;
        }
        int idx = counter - n; // Node before the one to be removed.
        // reset counter and curr
        counter = 1; curr = head;
        if(idx == 0) return head.next;
        while(counter != idx){
            counter++;
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}