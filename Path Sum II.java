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
    public ArrayList<ArrayList<Integer>> result;
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        result = new ArrayList<ArrayList<Integer>>();
        
        
        helper(root, sum, new ArrayList<Integer>());
        return result;
    }
    
    public void helper(TreeNode node, int sum, ArrayList<Integer> partialPath) {
        if (node == null)
            return;
            
        partialPath.add(node.val);
        ArrayList<Integer> temp1 = new ArrayList<Integer>(partialPath);
        ArrayList<Integer> temp2 = new ArrayList<Integer>(partialPath);
        if (node.left == null && node.right == null && node.val == sum) {
            result.add(partialPath);
        }
        
        helper(node.left, sum - node.val, temp1);
        helper(node.right, sum - node.val, temp2);
    }
}