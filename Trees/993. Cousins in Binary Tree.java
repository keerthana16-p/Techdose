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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null){
            return false;
        }
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
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
                if(temp.left!=null && temp.right!=null){
                if((temp.left.val==x && temp.right.val==y )||(temp.left.val==y &&temp.right.val==x)){
                    return false;
                }
                }
            }
            if(list.contains(x) && list.contains(y)){
                return true;
            }
        }
        return false;
    }
}
