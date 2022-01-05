class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length()<2)
            return s.length();
        
        int start = 0, end =  0;
        HashMap<Character, Integer> map = new HashMap<>();
        int maxcount = 0;
        
        while(end<s.length()){
            if(map.containsKey(s.charAt(end))){
                start = Math.max(start, map.get(s.charAt(end))+1);
            }
            
            maxcount = Math.max(maxcount, (end-start+1));
            map.put(s.charAt(end), end);
            end++;
        }
        
        return maxcount;
    }
}