class Solution {
    public int fib(int n) {
        
        if(n==0 || n==1){
            return n;
        }
        
        int firstSmallerSolution = fib(n-1);
        int secondSmallerSolution = fib(n-2);
        
        int biggerSolution = firstSmallerSolution + secondSmallerSolution;
        return biggerSolution;
        
    }
}