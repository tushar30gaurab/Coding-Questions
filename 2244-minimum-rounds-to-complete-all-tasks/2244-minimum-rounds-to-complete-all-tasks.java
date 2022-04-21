class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int element: tasks){
            hmap.put(element, hmap.getOrDefault(element, 0) + 1);
        }
        
        int res = 0;
        for(int elementFrequency: hmap.values()){
            if(elementFrequency == 1)
                return -1;
            res = res + (elementFrequency+2)/3;
        }
        
        return res;
    }
}