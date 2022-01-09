// Iterative solution
class Solution {
    public TreeNode increasingBST(TreeNode root) {
        if(root == null) return null;
        
        ArrayList<TreeNode> list = new ArrayList<>();
        inorderBST(root, list);                             // perform inorder traversal & store each node in a space (arraylist in this case). 
        int i=0;
        for( ; i<list.size()-1; i++){
            list.get(i).right = list.get(i+1);               //setting every node's right as next node from inorder fashion
            list.get(i).left = null;                         //setting every node's left as null
        }
        
        list.get(list.size()-1).left = null;                // leaf node's left = null
        list.get(list.size()-1).right = null;               // leaf node's right = null
        
        return list.get(0);              // return root node
    }
    
    public void inorderBST(TreeNode root, ArrayList<TreeNode> list){
        if(root == null)    // base condition
            return;
        
        inorderBST(root.left, list);
        list.add(root);
        inorderBST(root.right, list);
    }
}


// Recursive Solution
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
