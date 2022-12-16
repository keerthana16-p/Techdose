/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    String res="";
    public String serialize(TreeNode root) {
        toString(root);
        return res;
    }
    public void toString(TreeNode root){
        if(root==null){
            res=res+"*"+" ";
            return ;
        }
        res=res+root.val+" ";
        toString(root.left);
        toString(root.right);
    }
    // Decodes your encoded data to tree.
    int pos=-1;
    public TreeNode deserialize(String data) {
        return helper(data.split(" "));
    }
    public TreeNode helper(String[] str){
        pos++;
        if(str[pos].equals("*")){
            return null;
        }
        TreeNode root =  new TreeNode(Integer.parseInt(str[pos]));
        root.left = helper(str);
        root.right = helper(str);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
