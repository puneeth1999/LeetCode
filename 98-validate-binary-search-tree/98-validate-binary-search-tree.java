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
    public boolean isValidBST(TreeNode root) {
        return isBST(root, null, null);
    }
    public boolean isBST(TreeNode root, Integer mi, Integer ma){
        if(root == null)
            return true;
        if(mi != null && mi >= root.val)
            return false;
        if(ma != null && ma <= root.val)
            return false;
        return isBST(root.left, mi, root.val) && isBST(root.right, root.val, ma);
    }
}