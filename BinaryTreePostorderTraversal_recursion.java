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
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> leftList = new ArrayList<Integer>();
        ArrayList<Integer> rightList = new ArrayList<Integer>();
        if(root == null)
            return leftList;
        if(root.left != null)
            leftList = postorderTraversal(root.left);
        if(root.right != null)
            rightList = postorderTraversal(root.right);
        for(Integer nodeVal : rightList)
        {
            leftList.add(nodeVal);
        }
        leftList.add(root.val);
        return leftList;
    }
}
