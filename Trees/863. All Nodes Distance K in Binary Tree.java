/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public void find(TreeNode root,TreeNode target,Map<TreeNode,TreeNode> map){
        if(root==null){
            return ;
        }
        if(root==target){
            return ;
        }
        if(root.left!=null){
            map.put(root.left,root);
            find(root.left,target,map);
        }
        if(root.right!=null){
            map.put(root.right,root);
            find(root.right,target,map);
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,TreeNode> map = new HashMap<>();
        find(root,target,map);
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode>  queue = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();
        queue.offer(target);
        visited.add(target);
        int level=0;
        while(queue.size()>0){
            int size = queue.size();
            if(level==k){
                for(TreeNode node:queue){
                    res.add(node.val);
                }
                return res;
            }
            level++;
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                if(node.left!=null && !visited.contains(node.left)){
                    queue.offer(node.left);
                    visited.add(node.left);
                }
                if(node.right!=null && !visited.contains(node.right)){
                    queue.offer(node.right);
                    visited.add(node.right);
                }
                if(map.containsKey(node) && !visited.contains(map.get(node))){
                    queue.offer(map.get(node));
                    visited.add(map.get(node));
                }
            }
        }
        return res;
    }
}
