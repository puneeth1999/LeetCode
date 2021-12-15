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
        
        ListNode newNode = new ListNode(0);
        ListNode ptr = newNode;
        ListNode curr = head;
        int counter = 1;
        while(curr.next != null){
            counter++;
            curr = curr.next;
        }
        int tracker = counter - n + 1;
        int c2 = 1;
        curr = head;
        System.out.println(tracker);
        while(curr != null){
            
            if(c2 != tracker){
                ptr.next = curr;
                ptr = ptr.next;
            } 
            curr = curr.next;
            c2++;
        }
        ptr.next = null;
        return newNode.next;
    }
}