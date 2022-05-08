class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> index = new LinkedList<>();
        List<Integer> answer = new LinkedList<>();
        
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == key) {
                index.add(i);
            }
        }
        
        int last = 0;
        for(Integer idx : index) {
            int i = Math.max(last, idx-k);
            for(; i <= idx+k && i<nums.length; i++) {
                answer.add(i);
            }
            last = i;
        }
        
        return answer;
    }
}