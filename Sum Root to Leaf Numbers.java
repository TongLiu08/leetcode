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
    public int sumNumbers(TreeNode root) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        if (root == null)
            return 0;
        
        return helper(root, 0);
    }
    
    public int helper(TreeNode node, int partialSum) {
        if (node == null)
            return 0;
        partialSum = partialSum * 10 + node.val;
        if (node.left == null && node.right == null)
            return partialSum;
        return helper(node.left, partialSum) + helper(node.right, partialSum);
    }
}