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
    boolean is_same = true;
    boolean done1 = false;
    boolean done2 = false;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p== null && q != null )||(p !=null && q== null)) {
            return false;
        }
        if (p == null || q == null) {
            return is_same;
        }
        System.out.println("p: "+ p.val+ " q: " + q.val);
        if (p.val != q.val) {
            is_same = false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        
     }
}