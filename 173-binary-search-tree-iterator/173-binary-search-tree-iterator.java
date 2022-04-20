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
class BSTIterator {
    
    int index;
    ArrayList<Integer> list;
    
    public BSTIterator(TreeNode root) {
        index = 0;
        list = new ArrayList<>();
        inOrder(root, list);
    }
    
    public int next() {
        return list.get(index++);
    }
    
    public boolean hasNext() {
        return (index < list.size());
    }
    
    public void inOrder(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */