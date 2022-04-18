
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        perform(root, list);
        return list.get(k-1);
    }
    
    public void perform(TreeNode root, List<Integer> list){
        if(root == null)
            return;
        
        perform(root.left, list);
        list.add(root.val);
        perform(root.right, list);
    }
}