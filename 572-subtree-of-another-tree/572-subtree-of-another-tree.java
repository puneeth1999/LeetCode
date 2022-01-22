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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null) return true;
        else if(root == null || subRoot == null) return false;
        if(root.val == subRoot.val && isSameTree(root, subRoot)) return true;
        else return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    
    public boolean isSameTree(TreeNode root, TreeNode subroot){
        if(root == null && subroot == null) return true;
        else if(root == null || subroot == null) return false;
        else if(root.val != subroot.val) return false;
        return isSameTree(root.left, subroot.left) && isSameTree(root.right, subroot.right);
    }
}