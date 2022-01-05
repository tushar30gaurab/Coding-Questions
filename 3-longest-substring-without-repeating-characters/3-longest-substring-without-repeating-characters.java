class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int maxCount = 0;
        int start = 0, end = 0;
        Map<Character, Integer> map = new HashMap<>();
        
        while(end<s.length()){
            
            if(map.containsKey(s.charAt(end))){
                start = Math.max(start, map.get(s.charAt(end))+1);
            }
            
            maxCount = Math.max(maxCount, (end - start + 1));
            map.put(s.charAt(end), end);
            end++;
        }
        
        return maxCount;
    }
}