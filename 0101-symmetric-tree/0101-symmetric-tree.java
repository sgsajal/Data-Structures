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
   public void preOrder(TreeNode root,List<Integer> list){
    if(root==null) {list.add(-1); return;}
    list.add(root.val);
    preOrder(root.left,list);
    preOrder(root.right,list);
    return;
   }
   public void postOrder(TreeNode root,List<Integer> list){
    if(root==null){list.add(-1); return;}
    list.add(root.val);
    postOrder(root.right,list);
    postOrder(root.left,list);
    return;
   }

    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        List<Integer> l=new ArrayList<>();
        preOrder(root.left,l);
        List<Integer> r=new ArrayList<>();
        postOrder(root.right,r);
        if(l.size()!=r.size()){ return false;}
        for(int i=0;i<l.size();i++){
            // System.out.println(r.get(i)+" "+l.get(i));
            if(l.get(i)!=r.get(i)) return false;
        }
        return true;
    }
}