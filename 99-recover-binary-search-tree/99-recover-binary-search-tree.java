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
    public void recoverTree(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        inorderTraversal(root, list);
        // Find out the swapped numbers
        Integer firstElement = null;
        Integer secondElement = null;
        int prev = list.get(0);
        for(int i = 1; i < list.size(); i++){
            if(prev > list.get(i) && firstElement == null){
                firstElement = prev;
            }
            if(prev > list.get(i) && firstElement != null){
                secondElement = list.get(i);
            }
            prev = list.get(i);
        }
        // Recover BST using firstElement & secondElement
        recoverBST(root, firstElement, secondElement);
    }
    
    public void inorderTraversal(TreeNode root, ArrayList<Integer> list){
        if(root == null) return;
        inorderTraversal(root.left, list);
        list.add(root.val);
        inorderTraversal(root.right, list);
    }
    
    public void recoverBST(TreeNode root, int first, int second){
        if(root == null) return;
        if(root.val == first){
            root.val = second;
        } else if(root.val == second){
            root.val = first;
        }
        recoverBST(root.left, first, second);
        recoverBST(root.right, first, second);
    }
}