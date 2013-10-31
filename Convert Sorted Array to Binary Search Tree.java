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
    public TreeNode sortedArrayToBST(int[] num) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        return helper(num, 0, num.length - 1);
    }
    
    public TreeNode helper(int[] num, int begin, int end) {
        if (begin > end)
            return null;
        int index = (begin + end) / 2;
        TreeNode node = new TreeNode(num[index]);
        node.left = helper(num, begin, index - 1);
        node.right = helper(num, index + 1, end);
        
        return node;
    }
}