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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        ListNode head = new ListNode(0);
        ListNode curr = head;
        while(curr1 != null && curr2 != null){
            if(curr1.val < curr2.val){
                curr.next = new ListNode(curr1.val);
                curr1 = curr1.next;
            } else {
                curr.next = new ListNode(curr2.val);
                curr2 = curr2.next;
            }
            curr = curr.next;
        }
        while(curr1 != null){
            curr.next = new ListNode(curr1.val);
            curr1 = curr1.next;
            curr = curr.next;
        }
        while(curr2 != null){
            curr.next = new ListNode(curr2.val);
            curr2 = curr2.next;
            curr = curr.next;
        }
        return head.next;
    }
}