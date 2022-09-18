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
    public boolean isBalanced(TreeNode root) {
       
        // write your code here
        
        if(root == null){
            return true;
        }

        return isBalanced(root.right)&& isBalanced(root.left)&&(Math.abs(findHeight(root.right)-findHeight(root.left))<=1);

    }

    public int findHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        else{return Math.max(findHeight(root.left), findHeight(root.right))+1;}
        
        
    }
    
}