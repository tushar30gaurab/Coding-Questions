class Solution {
    public int[] countBits(int n) {
        
        int result[] = new int[n+1];
        for(int i=0; i<n+1; i++){
            int temp = i;
            
            while(temp!=0){
                if((temp&1)==1)
                    result[i]++;
                temp = temp>>>1;
            }
        }
        return result;
    }
}