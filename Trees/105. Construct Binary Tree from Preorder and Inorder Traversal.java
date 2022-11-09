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
    Map<Integer,Integer> map = new HashMap<>();
    int index=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return build(preorder,0,preorder.length-1);
    }
    public TreeNode build(int[] preorder,int left,int right){
        if(left>right){
            return null;
        }
        int val = preorder[index++];
        TreeNode root = new TreeNode(val);
        root.left = build(preorder,left,map.get(val)-1);
        root.right = build(preorder,map.get(val)+1,right);
        return root;
    }
}
