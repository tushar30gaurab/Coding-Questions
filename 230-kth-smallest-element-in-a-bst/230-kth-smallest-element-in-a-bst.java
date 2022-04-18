
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        performInorder(root, list);
        return list.get(k-1);
    }
    
    public void performInorder(TreeNode root, List<Integer> list){
        if(root == null)
            return;
        
        performInorder(root.left, list);
        list.add(root.val);
        performInorder(root.right, list);
    }
}