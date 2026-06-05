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

    int countNode = 0;
    public int goodNodes(TreeNode root) {
        inorder(root, Integer.MIN_VALUE);
        return countNode;
        
    }

    private void inorder(TreeNode root, int currMax){
        if(root == null) return;
        if(root.val >= currMax){
            countNode++;
            currMax = root.val;
        }
        inorder(root.left, currMax);
        inorder(root.right, currMax);
    }
}
