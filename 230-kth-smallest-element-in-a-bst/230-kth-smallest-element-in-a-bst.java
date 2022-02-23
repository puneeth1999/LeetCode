/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        inorder(root, list);
        return list.get(k-1);
    }
    
    public void inorder(TreeNode root, LinkedList<Integer> list){
        if(root ==  null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}