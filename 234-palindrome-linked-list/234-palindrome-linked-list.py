# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverse(self, node):
        pre = None
        curr = node
        nex = None
        while(curr != None):
            nex = curr.next
            curr.next = pre
            pre = curr
            curr = nex
        return pre
    
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        # find the mid node
        fast = head
        slow = head
        while(fast != None and fast.next != None):
            fast = fast.next.next
            slow = slow.next
        # slow is the middle node
        # reverse the list from slow
        tail = self.reverse(slow)
        while(tail != None):
            if(head.val != tail.val):
                return False
            head = head.next
            tail = tail.next
        return True
    