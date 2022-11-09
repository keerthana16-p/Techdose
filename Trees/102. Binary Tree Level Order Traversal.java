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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        if(root==null){
            return res;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<Integer>();
            int s = queue.size();
            for(int i=0;i<s;i++){
             TreeNode temp = queue.peek();
             list.add(temp.val);
             queue.pop();
             if(temp.left!=null){
                 queue.add(temp.left);
             }
             if(temp.right!=null){
                 queue.add(temp.right);
             }
            }
            if(list.size()>0){
             res.add(list);
            }
        }
        return res;
    }
}
