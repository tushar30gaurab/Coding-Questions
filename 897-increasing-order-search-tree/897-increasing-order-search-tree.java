class Solution {
    
    TreeNode pathfinder; // for finding path & connecting all dots
    public TreeNode increasingBST(TreeNode root) {
        
        TreeNode dummy = new TreeNode(0); // dummy node for starting reference.
        pathfinder = dummy;
        
        inorder(root); // actual work done here.
        return dummy.right; // return right node of dummy node (the actual root node).
    }
    
    public void inorder(TreeNode root){
        
        if(root == null)  // base condition
            return;
        
        inorder(root.left); // call for left subtree (assume it will do the work for left subtree)
        
        root.left = null; //  making root left node as null
        pathfinder.right = root; //  pathfinder's right part will now point the root node.
        pathfinder = root; // pathfinder node pointing one node ahead(on next function call, this will be the left subtree).
        
        inorder(root.right);  // call for right subtree (assume it will do the work for right subtree)
    }
}