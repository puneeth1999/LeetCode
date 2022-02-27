# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def widthOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        queue = [(0, root)]
        max_width = float('-inf')
        nulls = False
        nullCount = 0
        while(queue):
            indices = []
            n = len(queue)
            for _ in range(n):
                idx, node = queue.pop(0)
                indices.append(idx)
                if node.left:
                    queue.append((2*idx+1, node.left))
                if node.right:
                    queue.append((2*idx+2, node.right))
            max_width = max(max(indices) - min(indices) + 1, max_width)
            
        return max_width
        
        