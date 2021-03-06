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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0)
            return null;
        ListNode merged = lists[0];
        for(int i = 1; i < lists.length; i++){
            merged = merge(merged, lists[i]);
        }
        return merged;
    }
    public ListNode merge(ListNode one, ListNode two){
        ListNode curr1 = one;
        ListNode curr2 = two;
        ListNode head = new ListNode(0);
        ListNode curr = head;
        while(curr1 != null && curr2 != null){
            if(curr1.val < curr2.val){
                curr.next = new ListNode(curr1.val);
                curr1 = curr1.next;
            }
            else {
                curr.next = new ListNode(curr2.val);
                curr2 = curr2.next;
            }
            curr = curr.next;
        }
        while(curr1 != null){
            curr.next = new ListNode(curr1.val);
            curr = curr.next;
            curr1 = curr1.next;
        }
        while(curr2 != null){
            curr.next = new ListNode(curr2.val);
            curr = curr.next;
            curr2 = curr2.next;
        }
        return head.next;
    }
}