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
    int maxsum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        getsubtreesum(root);
        return maxsum;
    }
    public int getsubtreesum(TreeNode root){
        if(root==null){
            return 0;
        }
       int left = Math.max(getsubtreesum(root.left),0);
       int right = Math.max(getsubtreesum(root.right),0);
       maxsum=Math.max(maxsum,left+right+root.val);
       return Math.max(left+root.val,right+root.val);
    }
}
