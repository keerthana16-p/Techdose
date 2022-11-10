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
    List<TreeNode> list = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        if(root==null){
            return null;
        }
        inorder(root);
        return balance(0,list.size()-1);
    }
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        list.add(root);
        inorder(root.right);
    }
    public TreeNode balance(int left,int right){
        if(left>right){
            return null;
        }
        int mid = left+(right-left)/2;
        TreeNode root = list.get(mid);
        root.left=balance(left,mid-1);
        root.right=balance(mid+1,right);
        return root;
    }
}
