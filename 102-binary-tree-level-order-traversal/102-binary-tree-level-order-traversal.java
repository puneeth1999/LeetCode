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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList();
        if(root == null)
            return res;
        List<TreeNode> previous = new ArrayList();
        List<TreeNode> current = new ArrayList();
        previous.add(root);
        while(!(previous.size() == 0)){
            current = new ArrayList(); // reset every iteration
            for(TreeNode n : previous){
                if(n.left != null) current.add(n.left);
                if(n.right != null) current.add(n.right);
            }
            List<Integer> toPush = new ArrayList();
            for(TreeNode n : previous){
                toPush.add(n.val);
            }
            res.add(toPush);
            previous = current;
        }
        return res;
    }
    
}