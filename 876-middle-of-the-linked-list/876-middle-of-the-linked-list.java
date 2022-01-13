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
    public ListNode middleNode(ListNode head) {
        int counter = 1;
        ListNode curr = head;
        while(curr.next != null){
            counter++;
            curr = curr.next;
        }
        int idx = (counter / 2) + 1;
        curr = head; // reset the current to the first Node in the lsit.
        counter = 1;
        while(counter != idx){
            curr = curr.next;
            counter++;
        }
        return curr;
    }
}