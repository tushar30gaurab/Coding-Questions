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
    public boolean findTarget(TreeNode root, int k) {
        
        if(root == null)
            return false;
        
        ArrayList<Integer> list = new ArrayList<>();
        inorderBST(root, list);
        
        int start = 0, end = list.size()-1;
        while(start<end){
            if(list.get(start) + list.get(end) == k)
                return true;
            else if(list.get(start) + list.get(end) < k)
                start++;
            else if(list.get(start) + list.get(end) > k)
                end--;
        }
        
        return false;
    }
    
    public void inorderBST(TreeNode root, ArrayList<Integer> list){
        if(root == null)
            return;
        
        inorderBST(root.left, list);
        list.add(root.val);
        inorderBST(root.right, list);
    }
}