# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        # head = current = l2
        res = []
        while l1 and l2:
            if l1.val < l2.val:
                res.append(l1.val)
                l1 = l1.next
            else:
                res.append(l2.val)
                l2 = l2.next
            
        while l1:
            # print('l1 is still there')
            res.append(l1.val)
            l1 = l1.next
        while l2:
            # print('l2 is still there')
            res.append(l2.val)
            l2 = l2.next
        head = l2 = ListNode(0)
        for i in res:
            l2.next = ListNode(i)
            l2 = l2.next
        head = head.next
        return head