/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        if (root == null)
            return true;
        
        return helper(root) == -1 ? false : true;
    }
    
    public int helper(TreeNode node) {
        if (node == null)
            return 0;
        int lDepth = helper(node.left);
        if (lDepth == -1)
            return -1;
        int rDepth = helper(node.right);
        if (rDepth == -1)
            return -1;
        if (Math.abs(lDepth - rDepth) > 1)
            return -1;
        
        return 1 + Math.max(lDepth, rDepth);
    }
}