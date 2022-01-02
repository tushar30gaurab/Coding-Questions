//Iterative Approach
class Solution {
    public boolean isPowerOfTwo(int n) {
        long i,j;
        j=n;
        for(i=0;i<=31;i++)
        {
            if(j==(long)Math.pow(2,i))
                return true;
        }
        return false;
    }
}

//Recursive Approach
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

// Another Recursive Approach
class Solution {
    public boolean isPowerOfTwo(int n) {
        
        if(n<=0)
            return false;
        
        if(n==1)
            return true;
        
        if(n%2!=0)
            return false;
        
        return isPowerOfTwo(n/2);
        
    }
}

// Bit Manipulation solution
class Solution {
    public boolean isPowerOfTwo(int n) {
        
        return n > 0 && (n & (n-1)) == 0;
    }
}
/*
Key Idea
the binary form of every power of two likes 100...0, because pow(2, n) == 1 << n
1 = 1
2 = 10
4 = 100
8 = 1000
...
the binary form of everypow(2, n) - 1 likes 11..1
1 - 1 = 0 = 0        =>  1 & 0 = 1    & 0    = 0
2 - 1 = 1 = 1        =>  2 & 1 = 10   & 1    = 0
4 - 1 = 3 = 11       =>  4 & 3 = 100  & 11   = 0
8 - 1 = 7 = 111      =>  8 & 7 = 1000 & 111  = 0
...
so we can find pow(2, n) & (pow(2, n) - 1) == 0
for example, num = 4 = 100
4 - 1 = 3 = 11
4 & 3 = 100 & 11 = 0
Amazing, right?
But that's not enough! We need to expain that if n is not a power of two then n & n - 1 != 0
If m is not a power of two, then the binary form of m contains more than one 1, that is 1x..x10..0, x represents 0 or 1
som - 1 = 1x..x10..0 - 1 = 1x..x01..1, that is the first 1 in m is still in the binary form of m - 1, so that m & (m - 1) = 1x..x0..0 > 0
for example, m = 6 = 110
6 - 1 = 5 =v101
6 & 5 = 4 = 100 > 0
Did you find it? The bold 1 is still there!!!
More generally, for any number n > 0
n & n - 1 removes the last 1 in the binary form of n
if and only if n is a power of two, there is only one 1 in the binary form of n
*/
