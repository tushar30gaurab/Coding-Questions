// 1. Simple recursive solution | Time Complexity: O(2^n) | Space complexity: O(1)
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

// 2.(a) Dynamic Programming solution(Recursive) | Time Complexity: O(n) | Space complexity: O(n)
import java.util.*;
class Solution {
    public int fib(int n) {
        
        int arr[] = new int[n+1];
        Arrays.fill(arr, -1);
        return calculateFib(n, arr);
        
    }
    
    public int calculateFib(int n, int arr[]){
        
        if(n==0 || n==1){
            arr[n] = n;
            return n;
        }
        
        if(arr[n]!= -1){
            return arr[n];
        }
        
        return arr[n] = calculateFib(n-1, arr) + calculateFib(n-2, arr);
    }
}

// 2.(b) Dynamic Programming solution(Iterative) | Time Complexity: O(n) | Space complexity: O(n)
class Solution {
    public int fib(int n) {
        
        if(n==0 || n==1){
            return n;
        }
        
        int arr[] = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        
        for(int i=2; i<=n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        
        return arr[n];
    }
}

// 3. Advanced Dynamic Programming Solution(Iterative) | Time Complexity: O(n) | Space complexity: O(1)
class Solution {
    public int fib(int n) {
        
        if(n==0 || n==1){
            return n;
        }
        
        int first = 0;
        int second = 1;
        int sum = 0;
        
        for(int i=2; i<=n; i++){
            sum = first + second;
            first = second;
            second = sum;
            
        }
        
        return sum;
        
    }
}
