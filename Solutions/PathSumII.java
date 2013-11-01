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
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        
        helper(root, sum, new ArrayList<Integer>(), result);
        return result;
    }
    
    public void helper(TreeNode node, int sum, ArrayList<Integer> partialPath, ArrayList<ArrayList<Integer>> result) {
        if (node == null)
            return;
            
        partialPath.add(node.val);
        if (node.left == null && node.right == null && node.val == sum) {
            ArrayList<Integer> temp = new ArrayList<Integer>(partialPath);
            result.add(temp);
        }
        
        helper(node.left, sum - node.val, partialPath, result);
        helper(node.right, sum - node.val, partialPath, result);
        partialPath.remove(partialPath.size() - 1);
    }
}