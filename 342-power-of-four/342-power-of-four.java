class Solution {
    public boolean isPowerOfFour(int n) {
        
        // double check = (Math.log(n)%Math.log(4));
        // return (check - Math.floor(check)) == 0;
        return n > 0 && (n&(n-1)) == 0 && (n & 0x55555555) != 0;
    }
}