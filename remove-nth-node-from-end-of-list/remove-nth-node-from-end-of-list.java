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
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode a = newHead;
        ListNode b = newHead;
        while(n > 0){
            b = b.next;
            n--;
        }
        while(b.next != null){
            b = b.next;
            a = a.next;
        }
        a.next = a.next.next;
        return newHead.next;
    }
}