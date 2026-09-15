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
        return ValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    private boolean ValidBST(TreeNode root,Long lower,Long upper){
        if(root==null){
            return true;
        }
        if(root.val<=lower||root.val>=upper){
            return false;
        }
        boolean leftValid=ValidBST(root.left,lower,(long)root.val);
        boolean rightValid=ValidBST(root.right,(long)root.val,upper);
        return leftValid&&rightValid;
    }
}
