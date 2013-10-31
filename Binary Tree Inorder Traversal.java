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
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        if (root == null)
            return resultList;
        
        TreeNode curr = root, next = null;
        while (curr != null) {
            if (curr.left != null) {
                next = curr;
                curr = curr.left;
                TreeNode temp = curr;
                while (temp.right != null && temp.right != next) {
                    temp = temp.right;
                }
                if (temp.right == null) {
                    temp.right = next;
                } else {
                    temp.right = null;
                    resultList.add(next.val);
                    curr = next.right;
                }
            } else {
                resultList.add(curr.val);
                curr = curr.right;
            }
        }
        
        return resultList;
    }
}