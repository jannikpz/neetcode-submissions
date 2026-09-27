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
    public int maxDepth(TreeNode root) {
       return maxDepthhelper(root,0); 
    }
    public int maxDepthhelper(TreeNode root,int level){
        if(root==null){
            return level;
        }
        return Math.max(maxDepthhelper(root.left, level +1),maxDepthhelper(root.right,level + 1));
    }
}
