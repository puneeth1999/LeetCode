# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        head = current = ListNode(0)
        carry = 0
        while l1 or l2:
            current.next = ListNode(0)
            current = current.next
            if l1 and l2:
                summ = l1.val + l2.val + carry
                l1 = l1.next
                l2 = l2.next
            elif l1:
                summ = l1.val + carry
                l1 = l1.next
            elif l2:
                summ = l2.val + carry
                l2 = l2.next
            carry = 0
            if summ > 9:
                carry = summ // 10
                summ = summ % 10
            current.val = summ    
        
        if carry:
            current.next = ListNode(0)
            current.next.val = carry
        head = head.next
        return head