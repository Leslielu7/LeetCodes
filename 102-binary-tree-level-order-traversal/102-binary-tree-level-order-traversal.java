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
        List result = new ArrayList();
        if(root ==null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

    while(!queue.isEmpty()){
        int size = queue.size();
        List<Integer> level = new ArrayList();
        for(int i = 0; i < size; i++){
            TreeNode head = queue.poll();
            
            level.add(head.val);

            if(head.left != null){
                queue.offer(head.left);
            }           
            if(head.right != null){
                queue.offer(head.right);
            }           
        }
        result.add(level);
    }return result;
    }
}