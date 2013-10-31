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
    public int minDepth(TreeNode root) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        if (root == null) return 0;
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        root.val = 1;
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left == null && node.right == null)
                return node.val;
            if (node.left != null) {
                node.left.val = node.val + 1;
                queue.add(node.left);
            }
            if (node.right != null) {
                node.right.val = node.val + 1;
                queue.add(node.right);
            }
        }
        
        return -1;
    }
}