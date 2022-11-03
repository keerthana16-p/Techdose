class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<Integer>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return res;
        }
        traversal(root,targetSum);
        return res;
    }
    public void traversal(TreeNode root,int target){
        if(root!=null){
            list.add(root.val);
            root.val=target-root.val;
            if(root.left==null && root.right==null && root.val==0){
                res.add(new ArrayList<>(list));
            }
            traversal(root.left,root.val);
            traversal(root.right,root.val);
            list.remove(list.size()-1);
        }
    }
}
