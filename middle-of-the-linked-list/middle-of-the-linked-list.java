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
            curr = curr.next;
            counter++;
        }
        int mid = (counter / 2) + 1;
        ListNode newCurr = head;
        counter = 1;
        while(counter < mid){
            counter++;
            newCurr = newCurr.next;  
        }
        return newCurr;
    }
}