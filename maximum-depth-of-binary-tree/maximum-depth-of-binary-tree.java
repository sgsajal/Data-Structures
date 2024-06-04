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
    private int maxD=0;
    public void depthFinder(TreeNode root,int level){
        if(root==null) return;
        depthFinder(root.left,level+1);
        if(level>maxD) maxD=level;
        depthFinder(root.right,level+1);
    }

    public int maxDepth(TreeNode root) {
        int level=1;
        depthFinder(root,level);
        return maxD;
    }
}