import java.util.Map;
class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        Map<Integer, Integer> hm = new HashMap<>();
        int result=0;
        
        for(int element : nums){
            int avail = hm.getOrDefault(element, 0);
            result = result+avail;
            hm.put(element, avail+1);
        }
        
        return result;
    }
}