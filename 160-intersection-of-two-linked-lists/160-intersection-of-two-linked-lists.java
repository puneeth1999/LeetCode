/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curr = headA;
        int counter1 = 0;
        while(curr != null){
            counter1++;
            curr = curr.next;
        }
        curr = headB;
        int counter2 = 0;
        while(curr != null){
            counter2++;
            curr = curr.next;
        }
        int diff = Math.abs(counter1 - counter2);
        
        ListNode curr1 = headA;
        ListNode curr2 = headB;
        if(counter1 > counter2){
            int i = 0;
            while(i < diff){
                curr1 = curr1.next;
                i++;
            }
        } else{
            int i = 0;
            while(i < diff){
                curr2 = curr2.next;
                i++;
            }
        }
        
        while(curr1 != null && curr2 != null && curr1!=curr2){
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        if(curr1 == null || curr2 == null)
            return null;
        return curr1;
    }
}