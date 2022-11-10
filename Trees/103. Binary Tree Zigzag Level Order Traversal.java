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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int ctr = 1;
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<size;i++){
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
            if(ctr%2!=0){
                 res.add(list);
            }
            else{
                Collections.reverse(list);
                res.add(list);
            }
            ctr++;
        }
        return res;
    }
}
