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
    public List<String> binaryTreePaths(TreeNode root) {
    
    List result = new ArrayList();
    if(root == null){
        return result;
    }

    String path = "" + root.val;

    return findPath(root, path, result);
    }
    
        public List findPath(TreeNode node, String path, List paths){

            if(node.left==null && node.right==null){
                paths.add(path);
            }

            if(node.left!=null){
                findPath(node.left, path + "->"+ node.left.val, paths);
            }

            if(node.right!=null){
                findPath(node.right, path + "->" + node.right.val, paths);
            }            

        return paths;

        }
}