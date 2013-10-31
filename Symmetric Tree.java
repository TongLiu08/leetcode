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
    public boolean isSymmetric(TreeNode root) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        if (root == null)
            return true;
        Queue<TreeNode> treeQueue = new LinkedList<TreeNode>();
        treeQueue.add(root.left);
        treeQueue.add(root.right);
        while (!treeQueue.isEmpty()) {
            TreeNode leftNode = treeQueue.poll();
            TreeNode rightNode = treeQueue.poll();
            if (leftNode == null && rightNode == null)
                continue;
            if (leftNode == null || rightNode == null)
                return false;
            if (leftNode.val != rightNode.val)
                return false;
            treeQueue.add(leftNode.left);
            treeQueue.add(rightNode.right);
            treeQueue.add(leftNode.right);
            treeQueue.add(rightNode.left);
        }
        
        return true;
    }

}