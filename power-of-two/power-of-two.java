class Solution {
    
    public boolean checkPower(int n, int counter){
        if(counter>31){
            return false;
        }
        
        if(n == Math.pow(2,counter))
            return true;
        
        return checkPower(n, counter+1);
    }
    public boolean isPowerOfTwo(int n) {
        int counter = 0;
        boolean result = checkPower(n, counter);
        return result;
    }
}