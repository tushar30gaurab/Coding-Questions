class Solution {
    public List<TreeNode> allPossibleFBT(int n) {
        
        List<TreeNode> result = new ArrayList<>();
        if(n==1){
            result.add(new TreeNode(0));
            return result;
        }
        
        for(int i=1; i<n; i+=2){
            List<TreeNode> left = allPossibleFBT(i);
            List<TreeNode> right = allPossibleFBT(n-i-1);
            
            for(TreeNode l: left){
                for(TreeNode r: right){
                    TreeNode root = new TreeNode(0);
                    root.left = l;
                    root.right = r;
                    result.add(root);
                }
            }
        }
        
        return result;
    }
}