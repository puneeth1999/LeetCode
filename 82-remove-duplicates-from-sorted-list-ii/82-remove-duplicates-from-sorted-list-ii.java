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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode sentinel = new ListNode(0, head);
        ListNode pred = sentinel;
        while(head != null && head.next != null){
            if(head.next != null && head.next.val == head.val){
                while(head.next != null && head.next.val == head.val){
                    head = head.next;
                }
                pred.next = head.next;
            } else{
                pred = pred.next;
            }
            head = head.next;
        }
        return sentinel.next;
    }
}