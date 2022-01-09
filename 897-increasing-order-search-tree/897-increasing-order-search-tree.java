class Solution {
    public TreeNode increasingBST(TreeNode root) {
        if(root == null) return null;
        
        ArrayList<TreeNode> list = new ArrayList<>();
        inorderBST(root, list); // customised function for performing Inorder Traversal
        int i=0;
        for( ; i<list.size()-1; i++){
            list.get(i).right = list.get(i+1);
            list.get(i).left = null;
        }
        
        list.get(list.size()-1).left = null;
        list.get(list.size()-1).right = null;
        
        return list.get(0);
    }
    
    public void inorderBST(TreeNode root, ArrayList<TreeNode> list){
        if(root == null)
            return;
        
        inorderBST(root.left, list);
        list.add(root);
        inorderBST(root.right, list);
    }
}