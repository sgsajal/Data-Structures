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

    public void getAns(List<Integer> ans,TreeNode root){
        ans.add(root.val);
        if(root.left!=null) getAns(ans,root.left);
        if(root.right!=null) getAns(ans,root.right);
        return;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans=new LinkedList<>();
        if(root==null) return ans;
        getAns(ans,root);
        return ans;
    }
}