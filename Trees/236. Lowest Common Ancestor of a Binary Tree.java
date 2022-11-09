class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root==q){
            return root;
        }
        TreeNode left=null,right=null;
        if(root.left!=null){
            left = lowestCommonAncestor(root.left,p,q);
        }
        if(root.right!=null){
            right = lowestCommonAncestor(root.right,p,q);
        }
        if(left!=null && right!=null ){
            return root;
        }
        return left!=null?left:right;
    }
}
