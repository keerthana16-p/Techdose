class Solution {
    boolean res = false;
    public  boolean hasPathSum(TreeNode root, int targetSum) {
        traversal(root,targetSum);
        return res;
    }
    public void traversal(TreeNode root,int target){
        if(root!=null){
            root.val=target-root.val;
            if(root.left==null && root.right==null && root.val==0){
                res=true;
                return ;
            }
            traversal(root.left,root.val);
            traversal(root.right,root.val);
        }
    }
}
